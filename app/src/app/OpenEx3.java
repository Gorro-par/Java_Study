package app;

/*
 삼향 연산자
 - 형식)
 데이터형 변수 = 조건식 ? 값1 : 값2;
 */

public class OpenEx3 {
	public static void main(String[] args) {
		int a  = 3 < 5 ? 10 : 20 ; // int = String = char 다 가능
		System.out.println(a);
		
		int su1 = 10, su2 = 20;
		String result = su1 > su2 ? "참" : "거짓";
		System.out.println("결과 : " + result);
	}

}
