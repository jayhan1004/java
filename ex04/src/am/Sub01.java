package am;
import java.util.*;
public class Sub01 {
	public static void run() {
		ArrayList<Car> cars = new ArrayList<>();
		Car car1 = new Car(1, "현대", "그랜저", "블랙", 20000, "2020-03");
		cars.add(car1);
		car1 = new Car(2, "쉐보레", "티볼리", "블루", 35000, "2022-09");
		cars.add(car1);
		car1 = new Car(3, "기아", "K5", "화이트", 70000, "2017-12");
		cars.add(car1);
		
		boolean run=true;
		Scanner scan=new Scanner(System.in);
		  
		while(run) {
		     System.out.println("--------------------------------------------");
		System.out.println("1.차량등록|2.차량검색|3.차량목록|4.차량삭제|0.종료");
		System.out.println("--------------------------------------------");
		System.out.print("선택>");
		String menu=scan.nextLine();
		switch(menu) {
		case "1": //차량등록
			Car car = new Car();
			//코드가 정수 연속형일때 다음 입력하는 제품의 코드에 1씩 더한 값을 자동으로 입력
			Car last=cars.get(cars.size()-1);
			int next = last.getNo() + 1;
			car.setNo(next);
			System.out.println("번호>" + car.getNo());
			System.out.print("브랜드>");
			String company = scan.nextLine();
			car.setCompany(company);
			System.out.print("모델명>");
			String model = scan.nextLine();
			car.setModel(model);
			System.out.print("색상>");
			String color = scan.nextLine();
			car.setColor(color);
			System.out.print("주행거리>");
			String distance = scan.nextLine();
			car.setDistance(Integer.parseInt(distance));
			System.out.print("연식>");
			String date = scan.nextLine();
			car.setDate(date);
			cars.add(car);
		   break;
		   
		case "2": //차량검색
			while(true) {
			System.out.println("검색할 브랜드 또는 모델을 입력하세요.");
			System.out.println("검색모드를 종료하려면 '종료'를 입력하세요.");
			System.out.print("입력>");
			boolean find = false;
			String sname = scan.nextLine();
			if (sname=="") {System.out.println("검색모드종료"); break; }
			for (Car c:cars)
			if(sname.equals(c.getModel())||sname.equals(c.getCompany()))
				{System.out.println("브랜드:" + c.getCompany());
				System.out.println("모델:" + c.getModel());
				System.out.println("색상:" + c.getColor());
				System.out.println("주행거리:" + c.getDistance());
				System.out.println("연식:" + c.getDate());
				find=true;} 
			if(find==false) {System.out.println(sname + "은(는) 존재하지 않는 데이터입니다");}
			}//while
			break;
			
		case "3"://차량목록
			System.out.println("번호\t브랜드\t모델명\t색상\t주행거리\t연식");
			for (Car c:cars)
				{System.out.printf("%d\t%s\t%s\t%s\t%,d\t%s\n",
						c.getNo(), c.getCompany(), c.getModel(), c.getColor(), c.getDistance(), c.getDate());}
			System.out.println("현재 " + cars.size() + "개의 데이터가 등록되어 있습니다.");
		   break;
		   
		case "4"://삭제
			while(true) {
				System.out.println("삭제할 모델의 번호를 입력하세요.");
				System.out.println("삭제모드를 종료하려면 '종료'를 입력하세요.");
				System.out.print("입력>");
				boolean find = false;
				String sname = scan.nextLine();
				if (sname=="") {System.out.println("삭제모드종료"); break; }
				for (Car c:cars)
				if(sname.equals(c.getNo()))
					{System.out.println("브랜드:" + c.getCompany());
					System.out.println("모델:" + c.getModel());
					System.out.println("색상:" + c.getColor());
					System.out.println("주행거리:" + c.getDistance());
					System.out.println("연식:" + c.getDate());
					find=true;} 
				if(find==false) {System.out.println(sname + "은(는) 존재하지 않는 데이터입니다");}
				}//while
		   break;
		case "0":
		System.out.println("프로그램을 종료합니다.");
		   run=false;
		   break;
		default:
			System.out.println("0~4메뉴를 선택하세요!");
		}
		}//while
	}//run
				
		
		
		
		
	}

