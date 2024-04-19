package pm;
import java.util.*;
public class Sub03 {
	public static void run() {
		boolean run=true;
		Scanner scan = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		ArrayList<String> jusos = new ArrayList<>();
		names.add("홍길동"); jusos.add("인천 서구 경서동");
		names.add("심청이"); jusos.add("서울 강남구 압구정동");
		
		while(run)
		{System.out.println("\n--------------------------------------");
		System.out.println("1.주소등록|2.이름검색|3.주소목록|4.주소삭제|0.종료");
		System.out.println("--------------------------------------");
		System.out.print("선택>");
		String menu = scan.nextLine();
		switch(menu)
		{case "1" : //주소등록
					System.out.println("이름>");
					names.add(scan.nextLine());
					System.out.println("주소>");
					jusos.add(scan.nextLine());
					System.out.println("등록완료!");
					break;
		case "2" : //이름검색
					while(true) //연속검색을 위한 while
					{System.out.print("검색할이름>");
					String sname = scan.nextLine();
					if (sname=="") //입력안하면 검색모드 종료
						{System.out.println("검색을 종료합니다"); break;}
					boolean find = false;
					for (int i=0; i<names.size(); i++)
						{String name = names.get(i);
						if (sname.equals(name)) 
							{System.out.println("주소:" + jusos.get(i)); find=true;}//if
						}//for
					if (!find)
					{System.out.println(sname + "이(가) 존재하지 않습니다.");}
					}//while
					break; //case2 종료
		case "3" : //주소목록
					System.out.println("이름\t주소");
					for(int i=0; i<names.size(); i++) 
					{System.out.printf("%s\t%s\n", names.get(i), jusos.get(i));}
					System.out.println(jusos.size() + "명이 존재합니다.");
					break;
		case "4" : //주소삭제
					System.out.print("삭제할이름>");
					String rname = scan.nextLine();
					boolean find = false;
					for (int i=0; i<names.size(); i++)
					{String name=names.get(i);
					if (rname.equals(name))
						{System.out.println("주소:" + jusos.get(i)); find=true;
						System.out.println("정말 삭제하시겠습니까? Y/N");
						String answer = scan.nextLine();
						if(answer.equals("Y")||answer.equals("y"))
							{names.remove(i); jusos.remove(i); System.out.println("삭제완료."); break;} //예 하면 지움
						else {System.out.println("삭제취소");}
						}//if이름같음
					}//for검색
					if (!find) {System.out.println(rname + "이(가) 존재하지 않습니다.");}
			
			
			
			break;
		case "0" : System.out.println("프로그램을 종료합니다."); run=false; break;
		default : System.out.println("0~4번 메뉴를 선택하세요.");
		}//switch
			
			
			
			
			
			
			
			
			
		}//while
		
		
		
		
		
		
		
		
		
		
		
	}//method
}//class
