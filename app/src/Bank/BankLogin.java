//package Bank;
//
//import java.util.Scanner;
//
//public class BankLogin {	
//	boolean run;
//
//	Scanner scanner;
//
//	Member[] member_arr;
//	Member BankMain;
//	int cnt;
//	public BankLogin() {
//		run = true;
//		scanner = new Scanner(System.in);
//		member_arr = new Member[2];
//	}
//	
//	public void menu() { 
//		do {	
//			System.out.println("��������������������������������������������������������������������������������������������");
//			System.out.println("�� 1.����  | 2.���  |  3.�ܰ�  |  4.�޴� |  5.���� |");
//			System.out.println("��������������������������������������������������������������������������������������������");
//			System.out.print("����> ");
//			int menuNum = scanner.nextInt();
//		switch(menuNum) {
//			case 1 :
//				System.out.print("���� : ");
////				balance_arr[userNum-1] += scanner.nextInt();
////				member_arr[userNum - 1] += scanner.nextInt();
//				break;
//			case 2 :
//				System.out.print("��� : ");
////				balance -= scanner.nextInt();
////				balance_arr[userNum-1]  -= scanner.nextInt();
//				break;
//			case 3 :
////				System.out.println("�ܰ� : " + balance_arr[userNum-1]);
//				break;
//			case 4 :
//				System.out.println("�α׾ƿ��Ǹ� �޴��� �̵��մϴ�.");
//				Login();
//				break;
//			case 5 :
//				run = false;
//				break;
//			default:
//				System.out.println("�ٽ� �Է��ϼ���");
//			}
//			System.out.println();
//		}while(run);
//	}
//	public void Login() {
//		while(run) {
//		System.out.println("��������������������������������������������������������");
//		System.out.println("��1.�α��� | 2.ȸ������ |  3.���� |");
//		System.out.println("��������������������������������������������������������");
//		System.out.print("����> ");
//		int choose  = scanner.nextInt();
//		switch(choose) {
//			case 1 :
//				while(true) {
//					System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
//					System.out.print("���̵� : ");
//					String id = scanner.next();
//					System.out.print("��й�ȣ : ");
//					String pw = scanner.next();
////					System.out.println();
//					if(map.containsKey(id)) {
//						if(map.get(id).equals(pw)) {
//							System.out.println("�α��� �Ǿ����ϴ�");
//							scanner.close();
//							menu();
//						}else {
//							System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
//							break;
//						}
//					}else {
//						System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
//						break;
//					}
//		}
//			case 2 :
//				System.out.print("�̸� : ");
//				String name = scanner.next();
//				System.out.print("id : ");
//				String id = scanner.next();
//				System.out.print("password : ");
//				String pw = scanner.next();
//				
//				break;
//				
//			case 3 :
//				run = false;
//				
//			default :
////				System.out.println("�ٽ� �Է��Ͻʽÿ�");
//			}
//		}	
//	}