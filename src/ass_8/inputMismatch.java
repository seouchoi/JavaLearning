package ass_8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class inputMismatch {

	public static void main(String[] args) {
		try {
			int num = getNum();
			System.out.println("��� : "+num);
		}catch(InputMismatchException e) {
			System.out.println("�Է°��� �ùٸ��� �ʽ��ϴ�.");
		}finally {
			System.out.println("End");
		}
		

	}
	public static int getNum() throws InputMismatchException{
		Scanner input = new Scanner(System.in);
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
		int a = input.nextInt();
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		int b = input.nextInt();
		return a+b;
	}

}
