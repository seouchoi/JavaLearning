package ass_8;

import java.util.Scanner;

public class ThrowException {

	public static void main(String[] args) {
		try {
			int num = getNum();
			System.out.println("This is not odd number");
		}catch(MyException e) {
			System.out.println("This is odd number.");
		}finally{
			System.out.println("End");
		}
	}
	public static int getNum() throws MyException{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int a = input.nextInt();
		if(a%2==0)
		{
			throw new MyException();
		}
		return a;
	}
}
