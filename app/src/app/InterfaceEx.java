package app;
/*
 * �������̽�(interface)
 * 	- ��ü�� ���� �� �� ����.
 * 	- class���� ��ӽ� implement keyword�� ���
 * 	- ���� ����� ������
 * 	- interface���� ����� �߻� �޼��常�� ���� ��
 * 	- interface ���� ��ӽÿ��� extends�� ����� 
 * 	- �Ϲ����� �޼��带 ���� �� ����
 * 	- ��ӽ� interface�� �ִ� ��� �޼��带
 * 	  ������ �Ͽ� ���.
 * 	- interface�� ���ǵ� �޼��� �� �ϳ��� ������
 * 	  ���� �ʴ´ٸ� abstract class�� ���� �� �� ����.	
 * 	ǥ��)
 * 	interface A{
 * 		���� : [final][static] -> �����Ǿ� ����.
 * 		ex) int A = 10;
 * 		
 * 		�޼��� : [public][abstract] -> �����Ǿ� ����.
 * 		ex) void method();
 * 	}
 * 	���1)
 * 	abstract class B implements A{
 * 		�߻� �޼��� ����...
 * 		�Ϲ����� �޼��� ����...
 * 	}
 * 	���2)
 * 	abstract class B implements A{
 * 		�߻� �޼��� ����...
 * 		�Ϲ����� �޼��� ����...
 * 	}
 * 	���3)
 * 	class D extends C implements A{}
 * 	class D extends C implements A, b, C ... {}
 * 	
 * 	���4) interface A extends B
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
