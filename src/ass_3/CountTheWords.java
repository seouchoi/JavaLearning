package ass_3;
import java.util.*;

public class CountTheWords {

	public static void main(String[] args) {
		String poem="My Heart is like a singing bird\r\n"
				+ "Whose nest is in a watered shoot\r\n"
				+ "My heart is like and apple-tree\r\n"
				+ "Whose boughs are bent with thickset fruit;\r\n"
				+ "My heart is like a rainbow shell\r\n"
				+ "That paddles in a halcyon sea\r\n"
				+ "My heart is gladder than all these\r\n"
				+ "Because the birthday of my life\r\n"
				+ "Is come my love is come to me\r\n"
				;
		HashSet<String> set=new HashSet<String>();
		HashSet<String> lowerSet=new HashSet<String>();
		String[] result=poem.split("[\\s\\n]+");
		for(int i=0;i<result.length;i++)
		{
			set.add(result[i]);
		}
		System.out.println(set);
		int countWord=set.size();
		System.out.println(countWord);
		for(int j=0;j<result.length;j++)
		{
		 lowerSet.add(result[j].toLowerCase());
		}
		System.out.println(lowerSet);
		int countLowerWord=lowerSet.size();
		System.out.println(countLowerWord);
		
		
	}
}
