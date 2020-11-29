
public class Sample4_12 {
	public static void main(String[] aegs)
	{
		iVehicle[] vs = new iVehicle[2];
		
		vs[0] = new Car12(1234, 20.5);
		vs[1] = new Plane3(232);
		
		for(int i = 0; i<vs.length; i++)
		{
			vs[i].show();
			}
	}
}
interface iVehicle
{
	int weight = 1000;
	void show();
}
class Car12 implements iVehicle
{
	private int num;
	private double gas;
	
	public Car12(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("生成了車號為"+num+"汽油量為"+gas +"的車子");
	}

	public void show() {
		System.out.println("賽車的車號是" + num);
		System.out.println("汽油量是" + gas);
	}
}
class Plane3 implements iVehicle
{
	private int flight;
	
	public Plane3(int f)
	{
		flight = f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	public void show()
	{
		System.out.println("飛機的班次是"+flight);
	}
}
