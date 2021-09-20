package app;
import java.util.Scanner;


/*
 	표현)
 	do{
 		실행 구문;
 	}while ( 조건식 );
 	
 */
public class DoWhileEx {

	public static void main(String[] args) {
//		int cnt = 0;
//		do {
//			cnt++;
//			System.out.println("반복복 실행구문");
//		}while (cnt < 10);
		System.out.println("구구단을 할 숫자를 입력하세요 : ");
		int gogodan = 0;
		int momo = 0;
		momo = new Scanner(System.in).nextInt();
		do {
			gogodan++;
			System.out.println(momo + " * " + gogodan + " = " + momo*gogodan);
		}while (gogodan < 9);

	}
}
