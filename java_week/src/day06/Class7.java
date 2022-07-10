package day06;

public class Class7 {
	public static void main(String[] args) {
		person a = new person();
		person b = new person();
		
		a.setName("홍길동");
		a.setAge(23);
		a.setContry("한국");
		System.out.println(a.getName()+"은 "+ a.getContry()+"에서 온 " +a.getAge()+"살 이다.");
		
		b.setName("아무개");
		b.setAge(22);
		b.setContry("캐나다");
		System.out.println(b.getName()+"는 "+b.getContry()+"에서 온 "+b.getAge()+"살 이다.");
		// 홍길동은 한국에서 온 23살이다.
		// 아무개는 캐나다에서 온 22살이다.
	}
}
// 클래스명 : person
// 변수 : 이름, 나라, 나이
// 함수 : get, set
class person{
	private String name;
	private String contry;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContry() {
		return contry;
	}
	public void setContry(String contry) {
		this.contry = contry;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}