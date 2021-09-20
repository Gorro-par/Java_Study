package app;

import javax.annotation.processing.AbstractProcessor;

/*
 	�߻� (abstract)
 	��ü�� ��ȣ���� class�� ǥ���ϱ� ����.
 	Ư¡
 	- class �� ���� �߻� class�� �ǹ�(ex : abstract class).
 	- �Ϲ� �޼���� �߻� �޼��� ��� ���� ��.
 	- ��ü�� ���� �� �� ����.
 	- ��Ӱ��迡�� ������ ��.
 	- ���� �͸� Ŭ����(���� anonymous class)�� ��ü���� �� ���� ����.
 	- �߻� �޼ҵ�� �������� �ʴ´�.
 	- �߻� �޼���� ������(Oberride)�Ͽ� �����.
 	- ��ӽ� extends keyword�� �����.
 	ǥ��)
 		abstract class A{
 			int a;
 			ex) abstract void setA();
 				void setB(){}
	���)
		class B extends A{
			super class�� �߻� �޼��� ������
			}
 */

public class AbstractEx  extends Abs{ // awt (gui)
	
	@Override
	public void methodB() {
		System.out.println("�߻� �޼ҵ� ������");
	}
	
	public static void main(String[] args) {
		AbstractEx obj = new AbstractEx();
		System.out.println(obj.a);
		obj.methodA();
//		obj.methodB();
		
		/* ���� �͸� Ŭ����(���� anonymous class)
		 new Abs() {
		 	public void methodB() {
		 		System.out.printIn("�߻� �޼ҵ� ������");
		 		}
		 	}.methodB();
 		 */
		
	}

}
abstract class Abs{
	int a = 10;
	public void methodA() {
		System.out.println("�Ϲ����� �޼ҵ� ����");
	}
	public abstract void methodB();
}
