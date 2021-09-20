package app;

public class VarEx {

	public static void main(String[] args) {
		// 변수와 상수
//		int su = 10;  변수의 선언
		int su;
		su = 10;
		System.out.println(su);
		su = 20;
		System.out.println(su);
		
//		char b;
//		String c;
		
		String str = "HelloJava";
		System.out.println(str);
		str = "문자열";
		System.out.println(str);
//		자바에서는 상수를 표현할때 final 키워드를 사용합니다
		final int SU2 = 10;
//		b = 20;  에러발생 final : 1번만 저장 가능
		
		System.out.println(SU2);
		
	}

}
