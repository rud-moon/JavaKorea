package day08;

public class Review {
	public static void main(String[] args) {
		ReviewClass rc = new ReviewClass();
		rc.go();
		
		Review2 r2 = new Review2();
		System.out.println(r2.myString());
	}
}

class ReviewClass{
	private String str;
	public String myString() {
		System.out.println("myString함수 실행");
		return "문자열";
		// return 뒤 : 죽은 코드
	}
	public void go() {
		str = myString();
		System.out.println(str);
	}
}

// extends : 클래스를 복사붙여넣기(상속)
class Review2 extends ReviewClass{
		// ReviewClass의 코드가 붙여넣기 되어있음
		// 추가
	private int num = 10;
	public int myNum() {
		System.out.println(num);
		return num;
	}
	// 수정 (오버라이딩, 재정의)
	public String myString() {
		return "수정한  myString함수";
	}
}