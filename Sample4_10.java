
public class Sample4_10 {
	public static void main(String[] aegs)
	{
		Vehicle[] vs = new Vehicle[2];
		
		vs[0] = new Car10(1234, 20.5);
		vs[0].setSpeed(60);
		
		vs[1] = new Plane(232);
		vs[1].setSpeed(500);
		
		for(int i = 0; i<vs.length; i++)
		{
			vs[i].show();
		}
	}
}
abstract class Vehicle
{
	protected int speed;
	public void setSpeed(int s)
	{
		speed = s;
		System.out.println("將速度設為"+speed+"了");
	}
	abstract void show();
}
class Car10 extends Vehicle
{
	private int num;
	private double gas;
	public Car10(int n, double g)
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
class Plane extends Vehicle
{
	private int flight;
	
	public Plane(int f)
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
