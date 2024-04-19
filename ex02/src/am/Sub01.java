package am;

import java.util.Scanner;

public class Sub01 {
	public static void run() {
		System.out.println("성적관리프로그램");
		
		String[] names = new String[100];
		int[] kors = new int[100];
		int[] engs = new int[100];
		int[] mats = new int[100];
			names[0]="홍길동"; kors[0]=98; engs[0]=88; mats[0]=97;
			names[1]="심청이"; kors[1]=67; engs[1]=82; mats[1]=80;
		int count = 2;
		int ksum=0; int esum=0; int msum=0;
		float kavg; float eavg; float mavg;
		Scanner scan = new Scanner(System.in);
		boolean stop=false;
		while(!stop)
			{System.out.println("\n-----------------------");
			System.out.println("1.성적등록|2.성적출력|0.종료");
			System.out.println("-----------------------");
			System.out.print("선택>");
			String menu = scan.nextLine();
			switch(menu)
				{case "1" : System.out.print("이름>");
							String name = scan.nextLine();
							names[count]=name;
							System.out.print("국어>");
							int kor = Integer.parseInt(scan.nextLine());
							kors[count]=kor;
							System.out.print("영어>");
							int eng = Integer.parseInt(scan.nextLine());
							engs[count]=eng;
							System.out.print("수학>");
							int mat = Integer.parseInt(scan.nextLine());
							mats[count]=mat;
							count++;
							System.out.println("등록완료!");
							break;
			
				case "2" : if (count==0) {System.out.println("등록된 성적이 없습니다.");}
							else {for(int i=0; i<count; i++)
							{int tot = kors[i] + engs[i] + mats[i];
							double avg = tot / 3.;
							String grade = "";
							if (avg>=90)
								{if(avg>=95) {grade="A+";}
								else {grade="A0";}}
							else if (avg>=80)
								{if(avg>=85) {grade="B+";}
								else {grade="B0";}}
							else if (avg>=70)
								{if(avg>=75) {grade="C+";}
								else {grade="C0";}}
							else if (avg>=60)
								{if(avg>=65) {grade="D+";}
								else {grade="D0";}}
							else {grade="F";}

							ksum=ksum+kors[i]; 
							esum=esum+engs[i]; 
							msum=msum+mats[i]; 

							System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n",
									names[i], kors[i], engs[i], mats[i], tot, avg, grade);
									}
									
							
							kavg=ksum/count;
							eavg=esum/count;
							mavg=msum/count;
							System.out.printf("\t%.2f\t%.2f\t%.2f", kavg, eavg, mavg);
							System.out.println("\n" + count + "명 학생이 존재합니다.");}
							break;
							
				case "0" : System.out.println("프로그램을 종료합니다.");
							stop=true; break;
				default : System.out.println("0~2번 메뉴를 선택하세요!");}
			
			
			
			
			
			
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
