package am;
import java.util.*;
public class Sub02 {
	public static void run() {
		boolean run=true;
		Scanner scan = new Scanner(System.in);
		ArrayList<Juso> jusos = new ArrayList<>();
		Juso juso1 = new Juso("홍길동", "010 0001 0001", "인천");
		jusos.add(juso1);
		juso1 = new Juso("임꺽정", "010 0002 0002", "평안도");
		jusos.add(juso1);
		juso1 = new Juso("홍경래", "010 0003 0003", "함경도");
		jusos.add(juso1);
		
		
		while(run) {
			System.out.println("\n----------- 주소 관리자 -----------");
			System.out.println("1.등록|2.검색|3.목록|4.삭제|0.종료");
			System.out.println("--------------------------------");
			System.out.println("선택>");
			String menu = scan.nextLine();
			
			switch(menu) {
			case "1" ://주소등록
				Juso juso = new Juso();
				System.out.print("이름>");
				String name = scan.nextLine();
				juso.setName(name);
				System.out.println("번호>");
				String phone = scan.nextLine();
				juso.setPhone(phone);
				System.out.println("주소>");
				String address = scan.nextLine();
				juso.setAddress(address);
				jusos.add(juso);
				System.out.println(juso.toString() + "\n" + "등록완료!");
				System.out.println("현재 " + jusos.size() + "개의 데이터가 등록되어 있습니다.");
				break;
			case "2" : //검색 
					while(true) {
						System.out.println("검색할이름>");
						String sname = scan.nextLine();
						if (sname=="") {System.out.println("검색모드종료"); break; }
						boolean find = false;
						for (Juso j:jusos)
							{if(sname.equals(j.getName()))
								{System.out.println("이름:" + j.getName());
								System.out.println("번호:" + j.getPhone());
								System.out.println("주소:" + j.getAddress());
								find=true;} 
							}
						if(find==false) {System.out.println(sname + "은(는) 존재하지 않는 데이터입니다");}
						}//while
					break;
			case "3" : //주소목록 
				System.out.println("이름\t번호\t\t주소");
				for (Juso j:jusos)
				{System.out.printf("%s\t%s\t%s\n", j.getName(), j.getPhone(), j.getAddress());}				
				System.out.println("현재 " + jusos.size() + "개의 데이터가 등록되어 있습니다.");
				
				
				break;
			case "4" : //삭제
				System.out.println("삭제할이름>");
				String sname = scan.nextLine();
				boolean find = false;
				for (Juso j:jusos)
				{if(sname.equals(j.getName()))
					{System.out.println("이름:" + j.getName());
					System.out.println("번호:" + j.getPhone());
					System.out.println("주소:" + j.getAddress());
					find=true;
					System.out.println("삭제하시겠습니까? (Y/N)");}
					String ans = scan.nextLine();
					if (ans.equals("Y")||ans.equals("y"))
						{jusos.remove(j);
						System.out.println("삭제완료."); break;}
					else {System.out.println("삭제취소.");}
				
				
				
				}
				if(find==false) {System.out.println(sname + "은(는) 존재하지 않는 데이터입니다");}
				break;
			case "0" : System.out.println("종료합니다."); run=false; break;
			default : System.out.println("0~4번 메뉴 중 선택하세요.");
			
			}
			
			
			
			
			
			
			
			
			
			
			
		}//while
				
	}//run
}//class
