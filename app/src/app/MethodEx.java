package app;
/*	메소드(Method)
 	
 	형식)
 	- [접근 제어자][수정자][반환형] 메소드 명 (인자들){
 			실행 구문(구현);
 		* 접근 제어자(Modifiers) : private, default(friendly), protected, public
 		* 수정자 : static, final, abstract, native . . .
 		* 반환형 (return type) :
 			- 자바 데이터 자료형(기본형, 참조형) 전부 사용할 수 있음.
 			- void : 반환형이 없는 메소드 정의시 사용.
 		*메소드명 : 식별자로 임의의 이름 정의.
 		*인자(Arguments) : 매개 변수라고 하며 매소드 호출시 데이터를 전달 하기 위한 용도로 사용함.
 		*
 		ex1)
 		int method1(){
 			실행 구문;
 			return 값(int);
 		}
 		ex2)
 		void method2(int d) {
 			실행 구문;
 			int dan = d;
 		}
 		ex3)
 		void method2(int a) {
 			실행 구문;
 		}
 */

public class MethodEx {
	static int method() {
		return 10;
	}
	static void method2() {
		System.out.println("실행 구문");
	}
	static void method3(int a, String s) {
		System.out.println("method3 : " + a + ", " + s);
	}
	public static void main(String[] args) {
		int result = method();
		System.out.println(result);
		method2();
		method3(50, "A");
	}
}
