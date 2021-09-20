package app;
/*
 * 인터페이스(interface)
 * 	- 객체를 생성 할 수 없음.
 * 	- class에서 상속시 implement keyword를 사용
 * 	- 다중 상속이 가능함
 * 	- interface에는 상수와 추상 메서드만이 존재 함
 * 	- interface 간의 상속시에는 extends를 사용함 
 * 	- 일반적인 메서드를 갖을 수 없음
 * 	- 상속시 interface에 있는 모든 메서드를
 * 	  재정의 하여 사용.
 * 	- interface에 정의된 메서드 중 하나라도 재정의
 * 	  하지 않는다면 abstract class로 정의 할 수 있음.	
 * 	표현)
 * 	interface A{
 * 		변수 : [final][static] -> 생략되어 있음.
 * 		ex) int A = 10;
 * 		
 * 		메서드 : [public][abstract] -> 생략되어 있음.
 * 		ex) void method();
 * 	}
 * 	사용1)
 * 	abstract class B implements A{
 * 		추상 메서드 정의...
 * 		일반적인 메서드 정의...
 * 	}
 * 	사용2)
 * 	abstract class B implements A{
 * 		추상 메서드 정의...
 * 		일반적인 메서드 정의...
 * 	}
 * 	사용3)
 * 	class D extends C implements A{}
 * 	class D extends C implements A, b, C ... {}
 * 	
 * 	사용4) interface A extends B
 */

public class InterfaceEx extends AbstractC implements InterfaceA, InterfaceB{
	@Override
	public void methodA() {
		
	}
	@Override
	public String methodB() {
		return "methodB";
	}
	public static void main(String[] args) {
		InterfaceEx obj  = new InterfaceEx();
		obj.methodA();
		String msg = obj.methodB();
		System.out.println(msg);
		obj.methodC();
		System.out.println(obj.A);
		System.out.println(obj.B);

	}

}
interface InterfaceA{
	int A = 10;
	void methodA();
}
interface InterfaceB{
	int B = 20;
	String methodB();
}
abstract class AbstractC{
	void methodC() {
		System.out.println("methodC");
	}
}
