package app;
/*	�޼ҵ�(Method)
 	
 	����)
 	- [���� ������][������][��ȯ��] �޼ҵ� �� (���ڵ�){
 			���� ����(����);
 		* ���� ������(Modifiers) : private, default(friendly), protected, public
 		* ������ : static, final, abstract, native . . .
 		* ��ȯ�� (return type) :
 			- �ڹ� ������ �ڷ���(�⺻��, ������) ���� ����� �� ����.
 			- void : ��ȯ���� ���� �޼ҵ� ���ǽ� ���.
 		*�޼ҵ�� : �ĺ��ڷ� ������ �̸� ����.
 		*����(Arguments) : �Ű� ������� �ϸ� �żҵ� ȣ��� �����͸� ���� �ϱ� ���� �뵵�� �����.
 		*
 		ex1)
 		int method1(){
 			���� ����;
 			return ��(int);
 		}
 		ex2)
 		void method2(int d) {
 			���� ����;
 			int dan = d;
 		}
 		ex3)
 		void method2(int a) {
 			���� ����;
 		}
 */

public class MethodEx {
	static int method() {
		return 10;
	}
	static void method2() {
		System.out.println("���� ����");
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
