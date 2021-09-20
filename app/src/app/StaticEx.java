package app;


/*
 	��Ÿ ������(������)
 	����)
 	 final :
 	 	- class : ����� �ȵ�
 	 	- method : ������ �ȵ�
 	 	- variable : ���ȭ
 	 static :
 	 	- ��ü ���� ���� �� ����(���� �޸𸮿� ����)
 	 abstract : 
 	 	- class : �߻� Ŭ����
 	 	- method : �߻� �޼ҵ�
 	 	
 	 [������][����������] ...
 */

public class StaticEx {
	public final int A = 10;
	public static int B = 20;
	public static void method() {
		System.out.println("method");
	}
	public static void main(String[] args) {
		StaticEx se = new StaticEx();
//		System.out.println(new StaticEx().A);  	- ���� ������ ��������� �ٸ� ��ü�� �з��ȴ�
//		System.out.println(new StaticEx().A);	--
		System.out.println(se.A);
		System.out.println(StaticEx.B);
//		StaticEx.method();
		method();
	}

}
