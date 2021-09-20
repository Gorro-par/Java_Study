package app;

public class MethodEx2 {
	static void method1(int a) {
		int b = 0;
		for (int i = 1; i <= a; i++) {
			b += i;
		}
		System.out.println("결과1 : " + b);
		
	}

	public static void main(String[] args) {
// 		문제1) 1 ~ 10 범위의 합을 출력하시오.(Method 사용)
		method1(100);
	}

}
