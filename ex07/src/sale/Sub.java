package sale;
import java.text.DecimalFormat;
import java.util.*;
import product.*;


public class Sub {
	public static void run() {
		SaleDAO dao = new SaleDAO();
		ProductDAO pdao = new ProductDAO();
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###원");
		while(run) {
			System.out.println("\n=========================================");
			System.out.println("1.판매등록|2.판매조회|3.판매현황|4.판매정보삭제|0.종료");
			System.out.println("=========================================");
			System.out.println("선택>");
			String menu= scanner.nextLine();
			switch(menu) {
			case "1" :
				break;
				
			case "2" : //판매조회
				System.out.print("조회할 상품코드>");
				String code2 = scanner.nextLine();
				ProductVO vo2= pdao.read(code2);
				if(vo2.getCode()==null) {
					System.out.println(code2 + "번에 해당하는 상품이 존재하지 않습니다.");
				}else {
					System.out.println("상품이름:" + vo2.getName());
					System.out.println("상품가격:" + df.format(vo2.getPrice()));
				}
				break;
				
			case "3" : //판매현황
				for(SaleVO vo:dao.list()) {
					System.out.println(vo.toString());
				}
				break;
				
			case "4" :
				break;
				
			case "0" :
				System.out.println("판매관리를 종료합니다.");
				run = false;
				break;
				
			default:
				System.out.println("0~4 메뉴를 입력하세요!");
				break;
			}//switch   
		}//while
	}//method

}
