//package app;
//
//import java.util.Scanner;
//
//public class BankSystem {	
//	boolean run;
////		int i = 0;
////		int[] balance_arr = new int[2];
//	Scanner scanner;
////	int [] balance_arr;
//	Member[] member_arr;
//	Member session;
//	int cnt;
//	public BankSystem() {
//		run = true;
//		scanner = new Scanner(System.in);
//		member_arr = new Member[2];
//	}
//	
//	public void menu() {
//		do {	
//			System.out.println("��������������������������������������������������������������");
//			System.out.println("��1.���� | 2.��� | 3.�ܰ� | 4.���� |");
//			System.out.println("��������������������������������������������������������������");
//			System.out.print("����> ");
//			int menuNum = scanner.nextInt();
//			System.out.print("����� ����> ");
//			int userNum = scanner.nextInt();
//		switch(menuNum) {
//			case 1 :
//				session
//				System.out.print("���� : ");
////				balance_arr[userNum-1] += scanner.nextInt();
////				member_arr[userNum - 1] += scanner.nextInt();
//				break;
//			case 2 :
//				session
//				System.out.print("��� : ");
////				balance -= scanner.nextInt();
////				balance_arr[userNum-1]  -= scanner.nextInt();
//				break;
//			case 3 :
//				sessison
////				System.out.println("�ܰ� : " + balance_arr[userNum-1]);
//				break;
//			case 4 :
//				run = false;
//				break;
//			case 5 :
//				methodA();
//				break;
//			case 6:
//				session = methodB();
//				if( session != null) {} // 0
//				
//				else {} // X
//				break;
//			default:
//				System.out.println("�ٽ� �Է��ϼ���");
//			}
//			System.out.println();
//		}while(run);
//	}
//	public void methodA() {
//		System.out.println("�̸� : ");
//		String name = scanner.next();
////		scanner.nextInt(); X
////		...
//		Member member = new Member(name, "abc", "123", 0);
//		member_arr[cnt++] = member;
//	}
//	public Member methodB() {
//		System.out.print("ID : ");
//		String id = scanner.next();
//		System.out.print("PW : ");
//		String pw = scanner.next();
//		Member member = login(id, pw);
//		return member;
//	}
//	public Member login(String id, String pw) {
//		Member result  = null;
//		for(Member member : member_arr) {
//			if(id.equals(member.getId()) && pw.equals(member.getPw())) {
//				System.out.println(member.getName() + "�� �α��� ����");
//				result = member;
//				break;
//			}
//		}
//		return result;
//	}
//	public static void main (String[]args) {
//		new BankSystem().menu();
//		System.out.println("���α׷� ����");
//	}
//
//}