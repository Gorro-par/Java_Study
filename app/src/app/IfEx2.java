package app;
import java.util.Scanner;
/* 제어문(더중 조건문)
 표현)
 	if ( 조건식1 ){
 		실행 구문 1;
 	}else if ( 조건문 2 ){
 		실행 구문 2;
 	}else{
 	
 	}
 	.
 	.
 	.
 	
 */
public class IfEx2 {

	public static void main(String[] args) {
		int score = 90;
		if( score > 0 && score <= 60) {
			System.out.println("C");
		}
		if( score > 60 && score <= 80 ) {
			System.out.println("B");
		}
		if( score > 80 && score <= 100) {
			System.out.println("A");
		}
		
		System.out.println("점수를 입력하세요 : ");
		score = new Scanner(System.in).nextInt();
		if( score > 0 && score < 61) {
			System.out.println("C");
		}
		if( score > 60 && score <= 80 ) {
			System.out.println("B");
		}
		if( score >= 81 && score <= 100) {
			System.out.println("A");
		}
		
	}
	

}
