package pm;

public class Sale {
	//필드
	String code;
	String name;
	int price;
	int qnt;
	
	
	//기본생성자 - s1생성
	public Sale() {}
	
	//생성자2 - s2생성
	public Sale(String code, String name, int price, int qnt) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.qnt = qnt;
	}
	
	//금액(sum)을 구하는 메서드
	public int sum() {int sum = price * qnt; return sum;}
	
	

	//내용을 가로출력
	public void print_land()
	{System.out.printf("%s\t%s\t%d만원\t%d개\t%,d만원\n",
			code, name, price, qnt, sum());}
	
	//내용을 세로출력
	public void print_port()
	{System.out.printf("코드:%s\n", code);
	System.out.printf("이름:%s\n", name);
	System.out.printf("가격:%d\n" , price);
	System.out.printf("수량:%d\n" , qnt);
	System.out.printf("총액:%,d\n" , sum());}
	
	
}
