package product;
import java.util.*;

import product.ProductVO;
import sale.Sub;


public class Main {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		ProductDAO dao = new ProductDAO();
		
		while(run) {
			System.out.println("\n=======================================================");
			System.out.println("1.상품등록|2.상품검색|3.상품목록|4.상품삭제|5.상품수정|6.매출관리|0.종료");
			System.out.println("=======================================================");
			System.out.print("선택>");
			String menu= scanner.nextLine();
			
			switch(menu) {
			case "1" : //상품등록
				ProductVO vo1 = new ProductVO();
				vo1.setCode(dao.getCode());
				System.out.println("상품코드:" + vo1.getCode());
				System.out.print("상품이름>");
				String name1 = scanner.nextLine();
				if (name1=="") {
					System.out.println("상품등록을 취소합니다.");
					break;
				}else {
					vo1.setName(name1);
				}
				while(true) {
					System.out.println("등록을 취소하려면 가격을 공백으로 두고 엔터를 누르세요.");
					System.out.print("상품가격>");
					String price1 = scanner.nextLine();
					if (price1=="") {
						System.out.println("등록을 취소합니다.");
						break;
					}
					if (check(price1)==true) { //가격이 숫자일때
						vo1.setPrice(Integer.parseInt(price1));
						System.out.println(vo1.toString());
						dao.insert(vo1);
						System.out.println("상품등록완료!");
						break;
					}
				} //가격이 숫자일때 입력완료, 숫자가 아니면 무한재입력
				break;
				
			case "2" : //상품검색
				while(true) {
					System.out.println("검색모드를 종료하려면 엔터를 입력하세요.");
					System.out.print("검색할 상품코드>");
					String code2 = scanner.nextLine();
					if(code2=="") {System.out.println("조회 종료"); break;}
					ProductVO vo2 = dao.read(code2);
					if (vo2.getCode()==null) {
						System.out.println(code2 + "번 상품이 없습니다.");
					}else {
						System.out.println(vo2.toString());
					}}
				break;
				
			case "3" : //상품목록
				ArrayList<ProductVO> array=dao.list();
				for(ProductVO vo:array) {
					System.out.println(vo.toString());
				}
				break;
				
			case "4" : //상품삭제
				System.out.print("삭제할 상품코드>");
				String code4 = scanner.nextLine();
				ProductVO vo4 = dao.read(code4);
				if(vo4.getCode()==null) {
					System.out.println(code4 +"번 상품이 없습니다.");
				}else {
					System.out.println(vo4.toString());
					System.out.println(vo4.getName() +"을(를) 정말 삭제합니까? (Y|N)" );
					String sel = scanner.nextLine();
					if(sel.equals("Y")||sel.equals("y")){
						if(dao.delete(code4)) {
						System.out.println("삭제완료.");
						}
						else {System.out.println("삭제실패. 데이터를 확인하세요.");}
					}else {
						System.out.println("삭제취소.");
					}
				}
				break;
				
			case "5" : //상품수정
				System.out.print("수정할 상품코드>");
				String code5 = scanner.nextLine();
				ProductVO vo5 = dao.read(code5);
				if(vo5.getCode()==null) {
					System.out.println(code5 +"번 상품이 없습니다.");
				}else {
					System.out.println("상품이름:"+ vo5.getName());
					System.out.println("상품이름을 변경하지 않을때는 공백으로 두고 엔터를 누르세요.");
					System.out.print("변경할 상품이름>");
					String name5 = scanner.nextLine();
					if(!name5.equals("")) vo5.setName(name5);
					while(true) { //숫자만 입력할때까지 반복
						System.out.println("상품단가:"+ vo5.getPrice());
						System.out.println("상품단가을 변경하지 않을때는 공백으로 두고 엔터를 누르세요.");
						System.out.print("변경할 상품단가>");
						String price5 = scanner.nextLine();
						if(price5.equals("")) {
							break; //공백인 경우 원가격 유지하고 종료
						}
						if(check(price5)) {
							vo5.setPrice(Integer.parseInt(price5));
							break; //숫자 입력하면 가격 변경
						}
					}//가격입력 while
					System.out.println(vo5.toString());
					System.out.println(vo5.getName() +"을(를) 정말 수정합니까? (Y|N)" );
					String sel5 = scanner.nextLine();
					if(sel5.equals("Y")||sel5.equals("y")){
						dao.update(vo5);
						System.out.println("수정완료.");
					}else {
						System.out.println("수정취소.");
					}
				}
				break;
				
			case "6" : //매출관리
				Sub.run();
				break;
				
			case "0" : //종료
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
				
			default:
				System.out.println("0~4 메뉴를 입력하세요!");
				break;
			}//switch   
		}//while
	}//method
	
	//숫자인지 판별하는 함수
	public static boolean check(String str) {
		try {
			Integer.parseInt(str);
			return true;
		}catch(Exception e) {
			System.out.println("숫자만 입력하세요.");
			return false;
		}
	}
	
	
}//class


