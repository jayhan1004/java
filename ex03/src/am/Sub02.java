package am;

import java.util.ArrayList;

public class Sub02 {
	public static void run() {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("100","고길동","청량리","02-222-3333"));
		students.add(new Student("101","둘리","엄마별","업워요"));
		students.add(new Student("102","또치","양계장","010-5292-8282"));
		
		for(Student s:students) {s.print();}
		
		System.out.println("");
		for (int i=0; i<students.size(); i++)
			{Student s=students.get(i); s.print();}
		
//		System.out.println("클래스란?");
//		System.out.println("----------------------------------");
//		
//		//Student.java의 생성자1 사용
//		Student s1 = new Student();
//		s1.no = "100";
//		s1.name = "고길동";
//		s1.juso = "청량리";
//		s1.phone = "02-222-3333";
//		s1.print();
//		System.out.println("----------------------------------");
//		
//		//Student.java의 생성자2 사용 (넘버, 이름만)
//		Student s2 = new Student("101", "둘리");
//		s2.print();
//		System.out.println("----------------------------------");
//		s2.juso = "엄마별";
//		s2.phone = "없워요";
//		s2.print();
//		System.out.println("----------------------------------");
//		
//		//Student.java의 생성자3 사용 (넘버, 이름, 주소, 번호)
//		Student s3 = new Student("102", "또치", "양계장", "010-5292-8282");
//		s3.print();
		
		
		
		
		
		
		
		
		
		
	}
}
