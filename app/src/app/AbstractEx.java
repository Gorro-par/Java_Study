package app;

import javax.annotation.processing.AbstractProcessor;

/*
 	추상 (abstract)
 	객체의 모호함을 class로 표현하기 위함.
 	특징
 	- class 에 사용시 추상 class의 의미(ex : abstract class).
 	- 일반 메서드와 추상 메서드 사용 가능 함.
 	- 객체를 생성 할 수 없음.
 	- 상속관계에서 재정의 함.
 	- 내부 익명 클래스(무명 anonymous class)로 객체생성 할 수는 있음.
 	- 추상 메소드는 구현하지 않는다.
 	- 추상 메서드는 재정의(Oberride)하여 사용함.
 	- 상속시 extends keyword를 사용함.
 	표현)
 		abstract class A{
 			int a;
 			ex) abstract void setA();
 				void setB(){}
	사용)
		class B extends A{
			super class의 추상 메서드 재정의
			}
 */

public class AbstractEx  extends Abs{ // awt (gui)
	
	@Override
	public void methodB() {
		System.out.println("추상 메소드 재정의");
	}
	
	public static void main(String[] args) {
		AbstractEx obj = new AbstractEx();
		System.out.println(obj.a);
		obj.methodA();
//		obj.methodB();
		
		/* 내부 익명 클래스(무명 anonymous class)
		 new Abs() {
		 	public void methodB() {
		 		System.out.printIn("추상 메소드 재정의");
		 		}
		 	}.methodB();
 		 */
		
	}

}
abstract class Abs{
	int a = 10;
	public void methodA() {
		System.out.println("일반적인 메소드 실행");
	}
	public abstract void methodB();
}
