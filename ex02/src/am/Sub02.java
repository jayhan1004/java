package am;

import java.util.Scanner;

public class Sub02 {
	public static void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("매출현황");
		boolean run=true;
		String[] names = new String[100];
		int[] prices = new int[100];
		int[] qnts = new int[100];
		names[0]="냉장고"; prices[0]=350; qnts[0]=15;
		names[1]="세탁기"; prices[1]=250; qnts[1]=17;
		int count = 2;
		
		while(run)
		{System.out.println("\n--------------------------------------");
		System.out.println("1.매출등록|2.매출현황|0.종료");
		System.out.println("--------------------------------------");	
		System.out.println("선택>");
		String menu = scan.nextLine();
		switch(menu)
			{case "1" : System.out.println("상품이름>");
						String name = scan.nextLine();				
						System.out.println("상품단가>");
						String price = scan.nextLine();
						System.out.println("판매수량>");
						String qnt = scan.nextLine();
						names[count]=name; prices[count]=Integer.parseInt(price);
						qnts[count]=Integer.parseInt(qnt);
						count=count+1;
				
						break;
			case "2" : System.out.println("제품명\t금액\t개수\t총판매액");
						int tot_sum=0;
						int tot_qnt=0;
						for(int i=0; i<count; i++)
						{int sum = prices[i]*qnts[i];
						tot_sum = tot_sum + sum;
						tot_qnt = tot_qnt + qnts[i];
						System.out.printf("%s\t%d만원\t%d개\t%,d만원\n", //%,d : 천단위마다 , 찍기
								names[i], prices[i], qnts[i], sum);}
						
						System.out.println("--------------------------------------");
						System.out.printf("총판매" + "\t\t%d개\t%,d만원\n",tot_qnt, tot_sum);
						System.out.println("--------------------------------------");
						System.out.println(count + "개 상품이 등록되었습니다.");
						
						break;
			case "0" : System.out.println("프로그램을 종료합니다.");
						run=false; break;
			default : System.out.println("0~2번 메뉴를 선택하세요!");} //switch
		
		
			
			
			
		} //while
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // void run
} // class
