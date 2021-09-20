package app;

//switch ~ case문
	/* 표현)
	 	switch (값) {
	 	case 값 1:
	 		실행 구문1;
	 	case 값 2:
	 		실행 구문2:
	 		break;  (선택)
	 	case 값 3:
	 		실행 구문3;
	 		break;	(선택)
	 		.
	 		.
	 		.
	 	default : 
	 		실행 구문4;
	 		break;	(선택)
	}
	 */

public class SwitchEx {

	public static void main(String[] args) {
		int val = 2;
		switch (val) {
		case 1:
			System.out.println("실행구문1");
		case 2:
			System.out.println("실행구문2");
			break;
		case 3:
			System.out.println("실행구문3");
			break;
		default:
			System.out.println("기본");
		}
	
	}

}
