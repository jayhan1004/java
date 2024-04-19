package pm;

import java.util.*;

public class Sub02 {
	public static void run() {
		//입력공간 만들기
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>();
		while(true)
		{System.out.println("값입력>");
		String num = scan.nextLine();
		if (num=="") {System.out.println("입력을 종료합니다."); break;}
		else {nums.add(Integer.parseInt(num));}}
		
		//데이터갯수, 수합계, 수평균 출력
		System.out.printf("데이터개수:%d\n", nums.size());
		int sum=0;
		for (int i=0; i<nums.size(); i++)
			{sum=sum+nums.get(i);} //ArrayList.get(i) : i번째 값 가져오기
		System.out.printf("데이터합계:%d\n", sum);
		System.out.printf("데이터평균:%.2f\n", sum/(float)nums.size());
		
		
		
		
		
		
		
		
		
	}
}
