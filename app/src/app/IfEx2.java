package app;
import java.util.Scanner;
/* ���(���� ���ǹ�)
 ǥ��)
 	if ( ���ǽ�1 ){
 		���� ���� 1;
 	}else if ( ���ǹ� 2 ){
 		���� ���� 2;
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
		
		System.out.println("������ �Է��ϼ��� : ");
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
