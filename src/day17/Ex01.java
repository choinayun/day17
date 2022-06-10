package day17;

// Wrapper class
// 일반적인 자료형을 클래스 타입으로 바꾸는 것을 의미 
// int -> Integer
// char -> Character
// double -> Double


class Test01 {
	public void sumF(int a, int b) {
		System.out.println(a+b);
	}
	public void sumF(String a, String b) {
		System.out.println(a+b);
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		Test01 t = new Test01();
		t.sumF(10, 20);
		t.sumF("aaa", "bbb");
	}
	
}
