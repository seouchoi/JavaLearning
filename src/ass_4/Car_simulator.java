package ass_4;
import java.util.*;

public class Car_simulator {

	public static void main(String[] args) {
		Car car=new Car();
		Scanner input=new Scanner(System.in);
		System.out.print("Year : ");
		car.year=input.nextInt();
		System.out.print("Maker : ");
		car.maker=input.next();
		car.speed=0;
		
		System.out.print("How many SpeedUp : ");
		int number=input.nextInt();
		for(int i=0;i<number;i++)
		{
			car.accel();
		}
		car.getYear();
		car.getMake();
		car.getSpeed();

	}

}
