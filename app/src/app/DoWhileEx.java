package app;
import java.util.Scanner;


/*
 	ǥ��)
 	do{
 		���� ����;
 	}while ( ���ǽ� );
 	
 */
public class DoWhileEx {

	public static void main(String[] args) {
//		int cnt = 0;
//		do {
//			cnt++;
//			System.out.println("�ݺ��� ���౸��");
//		}while (cnt < 10);
		System.out.println("�������� �� ���ڸ� �Է��ϼ��� : ");
		int gogodan = 0;
		int momo = 0;
		momo = new Scanner(System.in).nextInt();
		do {
			gogodan++;
			System.out.println(momo + " * " + gogodan + " = " + momo*gogodan);
		}while (gogodan < 9);

	}
}
