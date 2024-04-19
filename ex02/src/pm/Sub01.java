package pm;

import java.util.*;

public class Sub01 {
	public static void run() {
		//ArrayList 장점 : 생성시 크기 지정 필요x, 값 삭제 가능
		//ArrayList 만들고 값 넣기
		ArrayList<String> names = new ArrayList<>();
		names.add("홍길동");
		names.add("심청이");
		names.add("강감찬");
		names.add("성춘향");
		names.add("이몽룡");
		names.remove(1); //"값" 넣고도 가능 -> names.remove("심청이");
		
		for(int i=0; i<names.size(); i++)
		{String name=names.get(i);
		System.out.println(name);}
		
		
		Scanner scan = new Scanner(System.in);
		while(true) //검색모드 유지하기 위해 while 넣음
		{System.out.print("검색할이름>");
		//이름검색
		String sname = scan.nextLine(); //sname : 내가 입력한 찾을 값
		boolean find = false;
		if(sname=="") {System.out.println("검색을 종료합니다."); break;} //입력안하고 검색시 종료
		for (int i=0; i<names.size(); i++)
		{String name = names.get(i); //names : 원데이터, name : 검색을 위해 names에서 추출한 값
		if (sname.equals(name)) {find=true; System.out.println("존재합니다");}//if닫기
		}//for닫기
		if (find==false) {System.out.println("존재하지 않습니다");}
		
		//index로 검색해서 존재+몇번째 있는지
		int index=-1;
		for (int i=0; i<names.size(); i++)
		{String name = names.get(i);
		if (sname.equals(name)) {index=i+1;}}
		if (index==-1) {System.out.println("존재하지 않습니다.");}
		else {System.out.println(index + "번째 존재합니다.");}
		}//while
	}
}
