package am;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run=true;
		while(run) 
		{System.out.println("\n------------------------------");
		System.out.println("1.성적관리|2.매출현황|3.주소관리|0.종료");
		System.out.println("------------------------------");
		System.out.println("선택>");
		String menu = scan.nextLine();
		switch(menu)
		{case "1" : Sub01.run(); break;
		case "2" : Sub02.run(); break;
		case "3" : Sub03.run(); break;
		case "0" : run=false; break;
		default : System.out.println("0~3메뉴를 선택하세요!");} //switch
		
		
		
		
		
			
			
		}//while
	}//method
}//class
