package Bank;

public class MemberService {
	public Member member;
	public MemberService() {
		// ȸ������
		member = new Member("ȫ�浿", "abc", "123", 0);
	}
	public boolean login(String id, String pw) {
		boolean result = false;
		if(id.equals(member.getId()) && pw.equals(member.getPw())){
			System.out.println(member.getName() + "��");
			result = true;
		}
		return result;
	}
	public void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}
