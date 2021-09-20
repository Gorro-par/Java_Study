package api;

import java.util.regex.Pattern;

public class patternEx {

	public static void main(String[] args) {
		/*
		(02|010) : 02 or 010
		-        : - 포함
		\d{3,4}  : 3 or 4자리 숫자
		-        : - 포함
		\d{4}    : 4자리 숫자
		*/
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-372-2431";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치 합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		/*
		\w+       : 한개 이상의 알파벳 or 숫자
		@         : @
		\w+       : 한개 이상의 알파벳 or 숫자
		\.        : .
		\w+       : 한개 이상의 알파벳 or 숫자
		(\.\w+)?  : \.\w+이 없거나 한번더 올 수 있음
		*/
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "fjgh2554@naver.com";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치 합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습	니다.");
		}
	}

}
