package am;

import java.util.Scanner;

public class Sub03 {
	public static void run() {
		System.out.println("주소관리");
		Scanner scan = new Scanner(System.in);
		String[] names = new String[100];
		String[] jusos = new String[100];
		String[] phones = new String[100];
		int count=0;
		
		boolean run=true;
		while(run)
		{System.out.println("\n--------------------------------------");
		System.out.println("1.주소등록|2.주소현황|0.종료");
		System.out.println("--------------------------------------");	
		System.out.println("선택>");
		String menu = scan.nextLine();
		switch(menu)
		{case "1" : while(true) {
					System.out.println("이름>");
					String name = scan.nextLine();
					if(name=="") {System.out.println("입력을 종료합니다."); break;}
					System.out.println("주소>");
					String juso = scan.nextLine();
					if(juso=="") {System.out.println("입력을 종료합니다."); break;}
					System.out.println("전화>");
					String phone = scan.nextLine();
					if(phone=="") {System.out.println("입력을 종료합니다."); break;}
					//입력 안하면 종료하게
					names[count]=name;
					jusos[count]=juso;
					phones[count]=phone;
					count++;
					System.out.println("주소가 등록되었습니다.");}
					//while(true)로 묶어서 등록상태 유지, 입력 안하면 종료
					//break 안넣으면 case2까지 실행, 등록된 인원 바로 보여줌
		case "2" : if (count==0) {System.out.println("등록된 주소가 없습니다.");}
					else {System.out.println("이름\t주소\t전화");
						for (int i=0; i<count; i++)
						{System.out.printf("%s\t%s\t%s\n", names[i], jusos[i], phones[i]);}//for
					System.out.println(count + "명이 존재합니다.");}//case2 if else
			
			
			
			
			
			
			
			break;
		case "0" : run=false; break;
		default : System.out.println("0~2번 메뉴를 선택하세요!");}//switch	
		}//while
		System.out.println("프로그램을 종료합니다.");
		
		
		
		
		
		
		
		
		
	}//method
}//class
