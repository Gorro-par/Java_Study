package Bank;

import java.util.Scanner;

public class BankMenu {
	
	static int i = 0;
	
	
	
	static void user () {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
//		int i= 0;
		System.out.print("����� ����> ");
		i = scanner.nextInt()-1;
	}
	
	

	public static void main(String[] args) {
		boolean run = true;
//		int i = 0;
		int[] balance = new int[2];
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		do {	
			System.out.println("��������������������������������������������������������������");
			System.out.println("��1.���� | 2.��� | 3.�ܰ� | 4.���� |");
			System.out.println("��������������������������������������������������������������");
			System.out.print("����> ");
			int menuNum = scanner.nextInt();
			switch(menuNum) {
				case 1 :
					user();
					System.out.print("���� : ");
					balance[i] += scanner.nextInt();
					break;
				case 2 :
					user();
					System.out.print("��� : ");
					int a;
					a = scanner.nextInt();
					balance[i] -= a;
					if(balance[i] < 0) {
						System.out.println("�ܾ��� �����մϴ�");
						balance[i] += a;
					}
					break;
				case 3 :
					user();
					System.out.println("�ܰ� : " + balance[i]);
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
