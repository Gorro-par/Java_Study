package app;

/*
 *  ���(inheritance)
 		����̶� �ڽ��� �θ� ������ �ִ� ����̳� �Ƿ��� �����޴´ٴ� �ǹ�.
 		- Ư�� (�ڽ�) Ŭ������ �ٸ� (�θ�_ Ŭ������ ������ �ִ� ��� �ɹ������� �ɹ��޼ҵ带 ����� �� ����.
 		- ��� ���迡�� �ڽ� Ŭ������ ��ü�� ���� �Ͽ��� �� �θ� Ŭ������ ��ü�� �����Ǿ� ��.
 		- ��� ����ǥ������ extends keyword�� �����.
 		- ��� ���� ���� super, ����. �θ� class�� sub, ����. �ڽ� class�� �����.
 		- ����� ���信�� super�� this�� ������.
 		- �޼��带 ���� �� �� ����(method override).
 		- ���� ��� (�ڹٿ����� ���� ��� X).
 		- extends �� implements�� �Բ� ����� �� ����.
 	���� )
 	class A extends B{
 		���� ����;
 	}
 */

public class InherEx extends SuperClass{
	int c = 20;
	public InherEx() {
		super();
		System.out.println("InherEx");
	}
	public void method() { // public
		System.out.println("InherEx method");
	}
	public static void main(String[] args) {
		InherEx inher = new InherEx();
		System.out.println(inher.c);
		System.out.println(inher.a);
		System.out.println(inher.b);
		inher.method();
	}

}
class SuperClass{
	int a = 10;
	String b = "B";
	public SuperClass() {
		System.out.println("SuperClass");
	}
	public void method() {
		System.out.println("SuperClass method");
	}
}
