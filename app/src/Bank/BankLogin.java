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
//			System.out.println("──────────────────────────────────────────────");
//			System.out.println("│ 1.예금  | 2.출금  |  3.잔고  |  4.메뉴 |  5.종료 |");
//			System.out.println("──────────────────────────────────────────────");
//			System.out.print("선택> ");
//			int menuNum = scanner.nextInt();
//		switch(menuNum) {
//			case 1 :
//				System.out.print("예금 : ");
////				balance_arr[userNum-1] += scanner.nextInt();
////				member_arr[userNum - 1] += scanner.nextInt();
//				break;
//			case 2 :
//				System.out.print("출금 : ");
////				balance -= scanner.nextInt();
////				balance_arr[userNum-1]  -= scanner.nextInt();
//				break;
//			case 3 :
////				System.out.println("잔고 : " + balance_arr[userNum-1]);
//				break;
//			case 4 :
//				System.out.println("로그아웃되며 메뉴로 이동합니다.");
//				Login();
//				break;
//			case 5 :
//				run = false;
//				break;
//			default:
//				System.out.println("다시 입력하세요");
//			}
//			System.out.println();
//		}while(run);
//	}
//	public void Login() {
//		while(run) {
//		System.out.println("────────────────────────────");
//		System.out.println("│1.로그인 | 2.회원가입 |  3.종료 |");
//		System.out.println("────────────────────────────");
//		System.out.print("선택> ");
//		int choose  = scanner.nextInt();
//		switch(choose) {
//			case 1 :
//				while(true) {
//					System.out.println("아이디와 비밀번호를 입력해주세요");
//					System.out.print("아이디 : ");
//					String id = scanner.next();
//					System.out.print("비밀번호 : ");
//					String pw = scanner.next();
////					System.out.println();
//					if(map.containsKey(id)) {
//						if(map.get(id).equals(pw)) {
//							System.out.println("로그인 되었습니다");
//							scanner.close();
//							menu();
//						}else {
//							System.out.println("비밀번호가 일치하지 않습니다.");
//							break;
//						}
//					}else {
//						System.out.println("입력하신 아이디가 존재하지 않습니다.");
//						break;
//					}
//		}
//			case 2 :
//				System.out.print("이름 : ");
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
////				System.out.println("다시 입력하십시오");
//			}
//		}	
//	}