package ass_9;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileMaker {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {			
			Scanner input = new Scanner(System.in);
			String s = input.nextLine();
			PrintWriter prtWriter = new PrintWriter(new FileWriter("timer.txt",true));
			prtWriter.print(simple.format(date));
			prtWriter.print("      ");
			prtWriter.print(s+"\n");
			prtWriter.close();		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
