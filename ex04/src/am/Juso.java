package am;

public class Juso {
	//필드(속성) - 이름, 주소, 전화번호
	private int no;
	private String name;
	private String phone;
	private String address;
	
	public Juso() {}
	
	//생성자
	public Juso(String name, String phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	//getter and setter
	public String getName() {
		return name;
	}
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Juso [name=" + name + ", phone=" + phone + ", address=" + address + "]";
}
}