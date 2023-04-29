package ass_1;
import java.util.Scanner;

public class Temperture {

	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		System.out.print("Fahrenheit temperture : ");
		double fatem=a.nextDouble();
		double celtem= (double)5/9*(fatem-32);
		System.out.println("Celsius temperture : "+celtem);
		

	}

}
