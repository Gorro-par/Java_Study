package Bank;

import java.util.Scanner;

public class BankMenu3 {	

	public static void main(String[] args) {
		boolean run = true;
//		int i = 0;
		int[] balance_arr = new int[2];
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		do {	
			System.out.println("��������������������������������������������������������������");
			System.out.println("��1.���� | 2.��� | 3.�ܰ� | 4.���� |");
			System.out.println("��������������������������������������������������������������");
			System.out.print("����> ");
			int menuNum = scanner.nextInt();
			System.out.print("����� ����> ");
			int userNum = scanner.nextInt();
			switch(menuNum) {
				case 1 :
					System.out.print("���� : ");
					balance_arr[userNum-1] += scanner.nextInt();
					break;
				case 2 :
					System.out.print("��� : ");
					int a;
					a = scanner.nextInt();
					balance_arr[userNum-1] -= a;
					if(balance_arr[userNum-1] < 0) {
						System.out.println("�ܾ��� �����մϴ�");
						balance_arr[userNum-1] += a;
					}
					break;
				case 3 :
					System.out.println("�ܰ� : " + balance_arr[userNum-1]);
					break;
				case 4 :
					run = false;
					break;
					
				default:
					System.out.println("�ٽ� �Է��ϼ���");
				}
				System.out.println();
		}while(run);
		System.out.println("���α׷� ����");

	}

}