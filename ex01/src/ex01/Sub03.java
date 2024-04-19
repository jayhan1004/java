package ex01;

public class Sub03 {
 public static void run() {
	 //정수타입
	 int num1 = 10;
	 
	 //실수타입
	 float num2 = 11.5f; // float타입은 숫자뒤에 f붙여야함
	 double num3 = 12.5; // double은 더 많이 저장, f필요없
	 //"문자열" +(이어쓰기) 변수명
	 System.out.println("num1=" + num1);
	 System.out.println("num2=" + num2);
	 System.out.println("num3=" + num3);
	 
	 //형변환(정수->실수)
//	 num2=num1; //값받는애=값주는애
//	 System.out.println("num2=" + num2);
//	 num3=num1;
//	 System.out.println("num3=" + num3);
	 //형변환(실수->정수) - 강제형변환
	 num1=(int)num2;
	 //int쓰면 소수점 버림
	 System.out.println("num1=" + num1);
	 num1=(int)num3;
	 System.out.println("num1=" + num1);
	 
	 //문자타입
	 char str1='A'; //char 작은따옴표 + 한글자만
	 String str2="홍길동"; //String 대문자, 큰따옴표, 여러글자
	 System.out.println("str1=" + str1);
	 System.out.println("str2=" + str2);
 
	 //불린타입 (true or false)
	 boolean bool1 = true; //True 대문자 안됨!
	 boolean bool2 = false; //False 대문자 안됨!
	 System.out.println("bool1=" + bool1);
	 System.out.println("bool2=" + bool2);
	 
	 
	 
	 
	 
	 
	 
	 
 
 }
}
