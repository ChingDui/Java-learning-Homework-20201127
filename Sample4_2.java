
public class Sample4_2 {
	public static void main(String[] args)
	{
		RacingCar2 rccar1 = new RacingCar2(1234, 20.5, 5);
	}
}
class Car2
{
	private int num;
	private double gas;
	public Car2()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生成了車子");
	}
	public Car2(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+ num + "，汽油量設為" + gas);
	}
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+ num + "，汽油量設為" + gas);
	}
	public void show()
	{
		System.out.println("車號是"+ num );
		System.out.println("汽油量是"+ gas);
	}
}
class RacingCar2 extends Car2
{
	private int course;
	public RacingCar2()
	{
		course = 0;
		System.out.println("生成了賽車");
	}
	public RacingCar2(int n, double g, int c)
	{
		super(n, g);
		course = c;
		System.out.println("生成了編號為"+course+ "的賽車");
	}
	public void setCourse(int c)
	{
		course = c;
		System.out.println("經賽車編號設為" + course);
	}
}
