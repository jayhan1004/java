package pm;
import java.util.*;
public class Sub01 {
	public static void run() {
		//public - 다른곳에서도 사용가능
		//private - 이 클래스에서만 사용가능
		//안쓸때 - package안에서 아무데나
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Sale> sales = new ArrayList<>();
		Sale s1 = new Sale();
		s1.code="100";
		s1.name="삼성비스포크";
		s1.price=430;
		s1.qnt=12;
		sales.add(s1);
		Sale s2 = new Sale("101","프레스티지",150,7);
		sales.add(s2);
		
		while(run) {
			System.out.println("\n----------Sale Administrator-----------");
			System.out.println("1.상품등록|2.상품목록|3.상품조회|4.상품삭제|0.종료");
			System.out.println("--------------------------------------");
			System.out.print("메뉴선택>");
			String menu = scan.nextLine();
			switch(menu)
			{case "1" ://매출등록
				Sale s3 = new Sale();
				
//				//코드가 정수 연속형일때 다음 입력하는 제품의 코드에 1씩 더한 값을 자동으로 입력
//				Sale last=sales.get(sales.size()-1);
//				int code = Integer.parseInt(last.code) + 1; // 자동입력code를 실수형->정수형
//				s3.code = String.valueOf(code); //자동입력code를 정수형->실수형
//				System.out.println("상품코드>" + s3.code);
				
				System.out.print("상품코드>");
				s3.code = scan.nextLine();
				System.out.print("상품이름>");
				s3.name = scan.nextLine();
				while(true) {
				System.out.print("상품가격>");
				String price=scan.nextLine();
				if(numcheck(price))
					{s3.price=Integer.parseInt(price);}
				break;
				
				}
				System.out.print("판매수량>");
				s3.qnt = Integer.parseInt(scan.nextLine());
				sales.add(s3);
				System.out.println("상품등록완료");
				break;
				
			case "2" : 	int tot_qnt = 0;
						int tot_sum = 0;
						for(Sale s:sales)
							{s.print_land();
							tot_qnt = tot_qnt + s.qnt;
							tot_sum = tot_sum + s.sum();}
						System.out.println("--------------------------------------");
						System.out.printf("총판매\t\t\t\t\t%d개\t%,d만원\n", tot_qnt, tot_sum);
						System.out.println("--------------------------------------");
						System.out.println(sales.size() + "개 상품이 존재합니다.");
				break;
				
			case "3" : //상품조회
						System.out.print("조회할상품명>");
						String sname = scan.nextLine();
						boolean find = false;
						for (Sale s:sales)
							{if(s.name.equals(sname)||(s.code.equals(sname))) {s.print_port(); find=true;}}
						if (!find) System.out.println(sname + "상품이 존재하지 않습니다.");
				break;
				
			case "4" : System.out.print("삭제할상품명>");
			String rname = scan.nextLine();
			boolean remove = false;
			for (Sale s:sales)
				{if(s.name.equals(rname)||(s.code.equals(rname)))
				{remove=true;
				s.print_port();
				System.out.println("지울래?");
				String ans = scan.nextLine();
				if (ans.equals("Y")||ans.equals("y"))
					{sales.remove(s);
					System.out.println("삭제함 ㅇㅇ");}
				else {System.out.println("안할게");}
				}//find
				}//for-if
				if (!remove) System.out.println(rname + "상품이 존재하지 않습니다.");
				break;

			case "0" :run=false; break;
			default : System.out.println("0~4번 메뉴 중 선택하십시오.");
			}//switch
			}//while
			System.out.println("상품관리자를 종료합니다."); 

	}//method
	
	//숫자인지 아닌지 판별하는 메서드
	//입력받은값을 정수형 변환을 시도한다
	//성공하면(숫자를 입력해서 문자형->정수형) true 반환
	//실패하면(문자를 입력해서 문자형->실패) false 반환
	public static boolean numcheck(String str)
	{try {int num = Integer.parseInt(str); return true;}
	catch(Exception e) {return false;}	
		
		
		
		
	}
	
}//class
