package Bank;

public class MemberServiceEx {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("abc", "123");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
		}else {
			System.out.println("ID �Ǵ� PassWord�� �ùٸ��� �ʽ��ϴ�");
		}
		memberService.logout("abc");
	}

}
