package pm;

import java.io.*;
import java.util.*;

import am.Car;
//file관련은 io

public class Sub01 {
	public static void run() {
		File file = new File("c:/data/java/car.txt");
		try {BufferedReader reader = new BufferedReader(new FileReader(file));
		String line="";
//		StringTokenizer st = null; //변수 구분자 불러오기 - 토크나이저
		String [] items = new String[6];
		while((line=reader.readLine())!=null) { //readLine : 한줄씩 읽는다 //!=null null이 아닐때까지
//		st = new StringTokenizer(line, ","); //변수 구분자를 ,로
//		int no = Integer.parseInt(st.nextToken());	
//		String company = st.nextToken();
//		String model = st.nextToken();
//		String color = st.nextToken();
//		int distance = Integer.parseInt(st.nextToken());
//		String date = st.nextToken();
//		Car car = new Car(no, company, model, color, distance, date);
		
		//split 사용법	
		items = line.split(",");
		Car car = new Car();
		car.setNo(Integer.parseInt(items[0]));
		car.setCompany(items[1]);
		car.setModel(items[2]);
		car.setColor(items[3]);
		car.setDistance(Integer.parseInt(items[4]));
		car.setDate(items[5]);
		System.out.println("번호:" + car.getNo());
		System.out.println("브랜드:" + car.getCompany());
		System.out.println("모델명:" + car.getModel());
		System.out.println("색상:" + car.getColor());
		System.out.println("주행거리:" + car.getDistance());
		System.out.println("연식:" + car.getDate());
		System.out.println("-------------------------");
		
	
		
		}//while
		
		}//try
		catch(Exception e) {System.out.println("오류:" + e.toString());}
		
	}
}
