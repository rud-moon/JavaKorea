package day06;

public class Class4 {
	public static void main(String[] args) {
		
		사칙연산 계산기 = new 사칙연산();
		
		계산기.숫자입력(4,4);
		System.out.println(계산기.더하기());
		System.out.println(계산기.빼기());
		System.out.println(계산기.곱하기());
		System.out.println(계산기.나누기());
	}
}

class 사칙연산 {
	//더하기,빼기,곱하기,나누기
	int num1 = 0;
	int num2 = 0;
	
	void 숫자입력(int num1, int num2) {
	
	this.num1 = num1;
	this.num2 = num2;
	}
		
	int 더하기(){
		return num1+num2;
	}
	int 빼기(){
		return num1-num2;
	}
	int 곱하기(){
		return num1*num2;
	}
	int 나누기(){
		return num1/num2;
	}
}