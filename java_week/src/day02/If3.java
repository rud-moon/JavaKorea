package day02;

public class If3 {
	public static void main(String[] args) {
//		int 나이 = 20;
//		if(나이 >= 20) {
//			System.out.println("성인");
//		}else {
//			System.out.println("미성년자");
//		}
//		
		int 성적 = 87;
		if(성적 >= 90) {
			System.out.println("A");
		}if(성적<90 && 성적>=80) {
			System.out.println("B");
		}if(성적<80 && 성적>=70) {
			System.out.println("C");
		}if(성적 <70) {
			System.out.println("F");
		}
	}
}
