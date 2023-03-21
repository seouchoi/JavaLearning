import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {

		Scanner a=new Scanner(System.in);
		System.out.print("Write second : ");
		int s=a.nextInt();
		int m=s/60; 
		int h=m/60;
		int d=h/24;
		
		int seceond=s%60;
		int minute=m%60;
		int hour=h/24;
		
		System.out.println(d+"day "+hour+"hour "+minute+"minute "+seceond+"second");

	}

}
