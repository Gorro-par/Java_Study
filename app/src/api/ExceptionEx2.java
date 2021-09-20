package api;

public class ExceptionEx2 {

//	public static void main(String[] args) throws Exception{
	public static void main(String[] args) {
	try {
		login("abc", "123");
	} catch(Exception e) {
		System.out.println(e.getMessage());
	}
		
	}
	public static void login(String id, String pw) throws NotExistIDException, WrongPasswrodException{
		if(!id.equals("aaa")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
		if(!id.equals("111")) {
			throw new WrongPasswrodException("패스워드가 들립니다");
		}
	}
}
