package Bank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BankSystem {	
	boolean run;

	Scanner scanner;

	Member[] member_arr;
	Member BankMain;
	int cnt;
	public BankSystem() {
		run = true;
		scanner = new Scanner(System.in);
		member_arr = new Member[2];
	}
	
	public void menu() { 
		do {	
			System.out.println("──────────────────────────────────────────────");
			System.out.println("│ 1.예금  | 2.출금  |  3.잔고  |  4.메뉴 |  5.종료 |");
			System.out.println("──────────────────────────────────────────────");
			System.out.print("선택> ");
			int menuNum = scanner.nextInt();
		switch(menuNum) {
			case 1 :
				System.out.print("예금 : ");
//				balance_arr[userNum-1] += scanner.nextInt();
//				member_arr[userNum - 1] += scanner.nextInt();
				break;
			case 2 :
				System.out.print("출금 : ");
//				balance -= scanner.nextInt();
//				balance_arr[userNum-1]  -= scanner.nextInt();
				break;
			case 3 :
//				System.out.println("잔고 : " + balance_arr[userNum-1]);
				break;
			case 4 :
				System.out.println("로그아웃되며 메뉴로 이동합니다.");
				Login();
				break;
			case 5 :
				run = false;
				break;
			default:
				System.out.println("다시 입력하세요");
			}
			System.out.println();
		}while(run);
	}
	public void Login() {
		while(run) {
		System.out.println("────────────────────────────");
		System.out.println("│1.로그인 | 2.회원가입 |  3.종료 |");
		System.out.println("────────────────────────────");
		System.out.print("선택> ");
		int choose  = scanner.nextInt();
		switch(choose) {
			case 1 :
				Map<String, String> map  = new HashMap<String, String>();
				while(true) {
					System.out.println("아이디와 비밀번호를 입력해주세요");
					System.out.print("아이디 : ");
					String id = scanner.next();
					System.out.print("비밀번호 : ");
					String pw = scanner.next();
					System.out.println();
					if(map.containsKey(id)) {
						if(map.get(id).equals(pw)) {
							System.out.println("로그인 되었습니다");
							scanner.close();
							menu();
						}else {
							System.out.println("비밀번호가 일치하지 않습니다.");
							break;
						}
					}else {
						System.out.println("입력하신 아이디가 존재하지 않습니다.");
						break;
					}
		}
			case 2 :
				System.out.print("이름 : ");
				String name = scanner.next();
				System.out.print("id : ");
				String id = scanner.next();
				System.out.print("password : ");
				String pw = scanner.next();
				
				break;
				
			case 3 :
				run = false;
				
			default :
//				System.out.println("다시 입력하십시오");
			}
		}	
	}
//	public void save() throws IOException {
//		File file = new File("C:/work/BankMember.txt");
//		FileWriter = fwriter = new FileWriter(file);
//		BufferedWriter bw = new BufferedWriter(fwriter);
//		PrintWriter pw = new PrintWriter(bw, true);
//		InputStream is = System.in;
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(isr);
//		for(Member member : memberList) {
//			pw.printIn(new StringBuilder().append(member.getName())
//					.append(" | ").append(member.getId()).toString());
//		}
//	}
//	public void load() throws IOException {
//		File file = new File("C:/work/BankMember.txt");
//		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
//		while(br.ready()) {
//			StringTokenizer st = new StringTokenizer(br.readLine(), "|", true);
//			StringBuilder sb = new StringBuilder();
//			while(st.hasMoreElements()) {
//				sb.append(st.nextToken());
//			}
//			System.out.println(sb.toString());
//		}
//	}
	public static void main (String[]args) {
		new BankSystem().Login();
		System.out.println("프로그램 종료");
	}

}