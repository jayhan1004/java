package am;
import java.util.*;
public class Sub03 {
	public static void run() {
		ArrayList<Score> scores = new ArrayList<>();
		Score s1 = new Score("고길동",90,90,85);
		Score s2 = new Score("둘리",80,40,50);
		Score s3 = new Score("또치",70,50,60);
		scores.add(s1);
		scores.add(s2);
		scores.add(s3);
		
		for(Score s:scores)
			{s.print();}
		
		
		
		
		
	}
}
