package Bank;

public class MemberService {
	public Member member;
	public MemberService() {
		// 회원가입
		member = new Member("홍길동", "abc", "123", 0);
	}
	public boolean login(String id, String pw) {
		boolean result = false;
		if(id.equals(member.getId()) && pw.equals(member.getPw())){
			System.out.println(member.getName() + "님");
			result = true;
		}
		return result;
	}
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
