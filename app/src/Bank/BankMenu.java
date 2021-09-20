package Bank;

import java.util.Scanner;

public class BankMenu {
	
	static int i = 0;
	
	
	
	static void user () {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
//		int i= 0;
		System.out.print("사용자 선택> ");
		i = scanner.nextInt()-1;
	}
	
	

	public static void main(String[] args) {
		boolean run = true;
//		int i = 0;
		int[] balance = new int[2];
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		do {	
			System.out.println("───────────────────────────────");
			System.out.println("│1.예금 | 2.출금 | 3.잔고 | 4.종료 |");
			System.out.println("───────────────────────────────");
			System.out.print("선택> ");
			int menuNum = scanner.nextInt();
			switch(menuNum) {
				case 1 :
					user();
					System.out.print("예금 : ");
					balance[i] += scanner.nextInt();
					break;
				case 2 :
					user();
					System.out.print("출금 : ");
					int a;
					a = scanner.nextInt();
					balance[i] -= a;
					if(balance[i] < 0) {
						System.out.println("잔액이 부족합니다");
						balance[i] += a;
					}
					break;
				case 3 :
					user();
					System.out.println("잔고 : " + balance[i]);
					break;
				case 4 :
					run = false;
					break;
					
				default:
					System.out.println("다시 입력하세요");
				}
				System.out.println();
		}while(run);
		System.out.println("프로그램 종료");

	}

}
