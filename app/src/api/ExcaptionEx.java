package api;

//키보드 입력, 파일 처리, 네트윜 처리,DB 처리 등 외부와의 작업을 하는 경우
//예의치 못한 에러가 발생할 수 있으므로 자바에서는 반드시 예외처리를 하도록 있다

public class ExcaptionEx {
	String str = "";
	public void foo(int i) {
		try {
			if (i == 1) {
				throw new Exception();
			}
			str += " 1 ";
		}catch(Exception e) {
			str += " 2 ";
			return;
		}finally {
			str += " 3 ";
		}
		str += " 4 ";
	}
	public static void main(String[] args) {
		ExcaptionEx e = new ExcaptionEx();
		e.foo(0);
		e.foo(1);
		System.out.println(e.str);
//		char c = (char)System.in.read();
//		int[] arr = new int[1];
//		System.out.println(arr[1]);
		
		
//			String str = "A";
//			Object member = str;
//			Member m = (Member)member;
//		try {
//			예외발생지역
//			실행코드 1
//			char c = (char)System.in.read();
//			실행코드 2
//			실행코드 3
//		}catch(Exception e) {
//			예외처리지역
//		}finally {
//			반드시 실행하는지역
		}
	}


