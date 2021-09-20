package app;

/*	연산자
산술 : +, -, /, % , * 
가감 : ++ , --
비교 : <, <=, >, >=, ==, !=, instanceof
비트 : &, |
논리 : &&, ||
삼향 : expr ? expr : expr
 */
/*
데이터 연산자
수학적(산술) 연산자
표현)
	+	=>	더하기
	-	=>	빼기
	*	=>	곱하기
	/	=>	나누기
	%	=>	나머지
 */

public class OpenEx {

	public static void main(String[] args) {
		int su = 10;
		System.out.println("su = " + su);
		
		int su1 = 10, su2 = 20;
		int result = 0;
		result = su1 + su2;
		System.out.println("result = " + result);
//		~
		result = su1 / su2;
		System.out.println("결과4 : " + result);
		
	}

}
