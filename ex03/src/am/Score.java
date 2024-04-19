package am;

public class Score {
	//필드(속성)
	String name;
	int kor;
	int eng;
	int mat;
	
	//생성자
	public Score() {}
	
	public Score(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	//메서드
	public int total() //return 쓸때는 void 대신 return 받는 값의 타입을 써준다
		{int total = kor + eng + mat;
		return total;}
	public double avg()
		{return (kor+eng+mat)/3.;}
	public double avg1()
		{return total() / 3.;} 
	public void print()
		{System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n",
				name, kor, eng, mat, total(), avg(), grade());}
	
	public String grade()
		{String grade = "F";
		if (avg()>=95) {grade="A+";}
		else if (avg()>=90) {grade="A0";}
		else if (avg()>=85) {grade="B+";}
		else if (avg()>=80) {grade="B0";}
		else if (avg()>=75) {grade="C+";}
		else if (avg()>=70) {grade="C0";}
		else if (avg()>=65) {grade="D+";}
		else if (avg()>=60) {grade="D0";}
	
		return grade;}
	
	
	
	
	
	
	
	
	
	
	
}
