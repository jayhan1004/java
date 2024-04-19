package pm;
import java.io.*;
import java.util.*;


import am.Juso;

public class Sub02 {
	static Scanner scan = new Scanner(System.in);
	
	public static void read() {
		File file = new File("c:/data/java/address.txt");
		System.out.println("*********주소조회**********");
		System.out.print("조회할이름>");
		String sname = scan.nextLine();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = "";
			String [] items = new String[4];
			boolean find=false;
			while((line=reader.readLine())!=null) {
				items = line.split(",");
				if(sname.equals(items[1]))
				{System.out.println("연락처:" + items[2]);
				System.out.println("주소:" + items[3]);
				find=true;}}//while
			if(!find) System.out.println(sname + "이(가) 존재하지 않습니다.");
			
		}//try 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	public static void insert() {
		System.out.println("*********주소추가**********");
		File file = new File("c:/data/java/address.txt");
		try {
			FileWriter writer = new FileWriter(file, true);
			Juso juso = new Juso();
			System.out.print("번호입력>");
			juso.setNo(Integer.parseInt(scan.nextLine()));
			System.out.print("이름입력>");
			juso.setName(scan.nextLine());
			System.out.print("연락처입력>");
			juso.setPhone(scan.nextLine());
			System.out.print("주소입력>");
			juso.setAddress(scan.nextLine());
			writer.write(juso.getNo()+","+juso.getName()+","+juso.getPhone()+","+juso.getAddress()+"\n");
			writer.flush();
			writer.close();
			System.out.println("등록완료");
			run();
		}//try
		catch (IOException e) {System.out.println("파일이 존재하지 않습니다.");} //true = 기존+추가, false = 새로 작성
	}//insert
	

	
	public static void run() {
		File file = new File("c:/data/java/address.txt");
		try {BufferedReader reader = new BufferedReader(new FileReader(file));
		String line="";
		String [] items = new String[4];
		while((line=reader.readLine())!=null) {
			items = line.split(",");
			Juso juso = new Juso();
			juso.setNo(Integer.parseInt(items[0]));
			juso.setName(items[1]);
			juso.setPhone(items[2]);
			juso.setAddress(items[3]);
			System.out.println("번호:" + juso.getNo());
			System.out.println("이름:" + juso.getName());
			System.out.println("연락처:" + juso.getPhone());
			System.out.println("주소:" + juso.getAddress());
			System.out.println("-------------------------");
		}
		}//try
		catch(Exception e) {System.out.println("오류:" + e.toString());}
	}//run
}
