
public class Car {
	int year;
	String maker;
	double speed;
	
	void Car()
	{
	}
	void Car(int year,String maker,double speed)
	{
		this.year=year;
		this.maker=maker;
		this.speed=speed;
	}
	
	void accel()
	{
		speed+=5;
		System.out.println("Speed Up +5");
	}
	void getYear()
	{
		System.out.println("This car is made in "+year);
	}
	void getMake()
	{
		System.out.println("Car Maker : "+maker);
	}
	void getSpeed()
	{
		System.out.println("Car Speed : "+speed);
	}
}
