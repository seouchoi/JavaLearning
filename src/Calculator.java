import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner fst=new Scanner(System.in);
		Scanner scd=new Scanner(System.in);
		Scanner cal=new Scanner(System.in);
		
		System.out.print("First Number : ");
		float i=fst.nextInt();
		
		System.out.print("operator : ");
		String k=cal.next();
		
		System.out.print("Second Number : ");
		float j=scd.nextInt();
		
		switch(k)
		{
		case "+": System.out.printf("%.1f + %.1f = %.1f",i,j,i+j);
		break;
		case "-": System.out.printf("%.1f - %.1f = %.1f",i,j,i-j);
		break;
		case "*": System.out.printf("%.1f * %.1f = %.1f",i,j,i*j);
		break;
		case "/": System.out.printf("%.1f / %f = %.1f",i,j,i/j);
		}
		
		
		

	}

}
