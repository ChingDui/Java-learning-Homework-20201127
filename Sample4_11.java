
public class Sample4_11 {
	public static void main(String[] aegs)
	{
		Vehicle2[] vs = new Vehicle2[2];
		
		vs[0] = new Car11(1234, 20.5);
		vs[1] = new Plane2(232);
		
		for(int i = 0; i<vs.length; i++)
		{
			if(vs[i]instanceof Car11)
				System.out.println("第"+(i+1)+"個物件是Car類別");
			else
				System.out.println("第"+(i+1)+"個物件不是Car類別");
		}
	}
}
abstract class Vehicle2
{
	protected int speed;
	public void setSpeed(int s)
	{
		speed = s;
		System.out.println("將速度設為"+speed+"了");
	}
	abstract void show();
}
class Car11 extends Vehicle2
{
	private int num;
	private double gas;
	public Car11(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("生成了車號為"+num+"汽油量為"+gas +"的車子");
	}

	public void show() {
		System.out.println("賽車的車號是" + num);
		System.out.println("汽油量是" + gas);
		System.out.println("速度是" + speed);
	}
}
class Plane2 extends Vehicle2
{
	private int flight;
	
	public Plane2(int f)
	{
		flight = f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	public void show()
	{
		System.out.println("飛機的班次是"+flight);
		System.out.println("速度是" + speed);
	}
}
