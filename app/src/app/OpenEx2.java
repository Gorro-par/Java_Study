package app;
/*	비교 연산자
<
>
<=
>=
==
!=
!
instanceof
*/

public class OpenEx2 {

	public static void main(String[] args) {
		System.out.println(5 > 10);
		System.out.println(!(3 > 5));
		System.out.println(3 != 5);
		
		int x = 30;
		int y = 20;
		boolean result = x < y;
		System.out.println("결과 1 : " + result);
		result = x > y;
		System.out.println("결과 2 : " + result);

	}

}
