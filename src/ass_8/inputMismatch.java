package ass_8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class inputMismatch {

	public static void main(String[] args) {
		try {
			int num = getNum();
			System.out.println("결과 : "+num);
		}catch(InputMismatchException e) {
			System.out.println("입력값이 올바르지 않습니다.");
		}finally {
			System.out.println("End");
		}
		

	}
	public static int getNum() throws InputMismatchException{
		Scanner input = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int a = input.nextInt();
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int b = input.nextInt();
		return a+b;
	}

}
