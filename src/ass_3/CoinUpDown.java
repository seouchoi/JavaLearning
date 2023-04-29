package ass_3;
import java.util.*;

public class CoinUpDown {

	static String Coin() {
		int randomNum=(int)(Math.random()*2);
		if(randomNum<1)
		{
			return "H";
		}else if(randomNum>=1)
		{
			return "T";
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Choice H or T : ");
		String Choice=input.nextLine();
		
		if(Choice.equals(Coin()))
		{
			System.out.println("Correct!");
		}else {
			System.out.println("Incorrect..");
		}
		
	}

}
