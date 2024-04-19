package ex01;

public class Sub06 {
	public static void run() {
		//반복문 (for, while)
		int sum = 0;
		for (int i=1; i<=100; i=i+1) //i가 1부터 100까지 1씩 증가
			{sum = sum + i;} //i에 대한 합계를 sum에 저장
		//System.out.println("1~100합계(for):"+sum);
		sum = 0;
		for (int i=1; i<=100; i=i+2)
			{sum = sum + i;}
		//System.out.println("1~100홀수합(for):"+sum);
		sum = 0;
		for (int i=2; i<=100; i=i+2)
			{sum = sum + i;}
		//System.out.println("1~100짝수합(for):"+sum);
		
		int i=1;
		sum=0;
		while (i<=100) {sum=sum+i; i=i+1;}
		//System.out.println("1~100합계(while):"+sum);
		i=1;
		sum=0;
		while (i<=100) {sum=sum+i; i=i+2;}
		//System.out.println("1~100홀수합(while):"+sum);
		i=2;
		sum=0;
		while (i<=100) {sum=sum+i; i=i+2;}
		//System.out.println("1~100짝수합(while):"+sum);
		
		
		int j=2;
		
		for(i=2; i<=9; i++)
			{for(j=1; j<=9; j++) 
				{System.out.println(i*j);}
			}
		
	
	}
}
