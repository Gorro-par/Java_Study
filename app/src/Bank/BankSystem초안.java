//package Bank;
//
//import java.util.Random;
//import java.util.Scanner;
//
//import Bank.Member;
//
//public class BankSystem초안 {	
//	boolean run;
//	Scanner scanner;
//	Member[] member_arr;
//	Member session;
//	int cnt;
//	public BankSystem초안() {
//		run = true;
//		scanner = new Scanner(System.in);
//		member_arr = new Member[2];
//	}
//	
//	public void menu() {
//		do {	
//			System.out.println("───────────────────────────────");
//			System.out.println("│1.예금 | 2.출금 | 3.잔고 | 4.종료 |");
//			System.out.println("───────────────────────────────");
//			System.out.print("선택> ");
//			int menuNum = scanner.nextInt();
//			System.out.print("사용자 선택> ");
//			int userNum = scanner.nextInt();
//		switch(menuNum) {
//			case 1 :
////				session
//				System.out.print("예금 : ");
////				balance_arr[userNum-1] += scanner.nextInt();
////				member_arr[userNum - 1] += scanner.nextInt();
//				break;
//			case 2 :
////				session
//				System.out.print("출금 : ");
////				balance -= scanner.nextInt();
////				balance_arr[userNum-1]  -= scanner.nextInt();
//				break;
//			case 3 :
////				sessison
////				System.out.println("잔고 : " + balance_arr[userNum-1]);
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
//				System.out.println("다시 입력하세요");
//			}
//			System.out.println();
//		}while(run);
//	}
//	
////	public int getAccountNum() {
////		Random r = new Random();
////		int su[] = new Random();
////		for(int i = -; i < su.length; i++) {
////			su[i] = (int)(Math.random() * 9) + 1;
////			for(int j = 0; j < i; j++) {
////				if(su[i] == su[j]) {
////					su[i] = r.nextInt()
////				}
////			}
////		}
////	}
//	public void methodA() {
//		System.out.print("이름 : ");
//		String name = scanner.next();
////		scanner.nextInt(); X
////		...
//		Member member = new Member(name, "abc", "123", 0);
//		member_arr[cnt++] = member;
//	}
//	public Member login(String id, String pw) {
//		Member result  = null;
//		for(Member member : member_arr) {
//			if(id.equals(member.getId()) && pw.equals(member.getPw())) {
//				System.out.println(member.getName() + "님 로그인 성공");
//				result = member;
//				break;
//			}
//		}
//		return result;
//	}
//	public static void main (String[]args) {
//		new BankSystem초안().menu();
//		System.out.println("프로그램 종료");
//	}
//
//}