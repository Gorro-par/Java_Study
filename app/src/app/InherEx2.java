package app;

class C{
	int num = 10;
	String msg  = "msg...";
	public C() {
		System.out.println("C");
	}
	public void method() {
		System.out.println("method " + num);
	}
	public void method_C() {
		System.out.println("method_C " + msg);
	}
}
class B extends C{
	public B() {
		super();
		System.out.println("B");
	}
	int num = 50;
	@Override
	public void method() {
		super.method_C();
		this.method_C();
		System.out.println("method " + num);
	}
	public void method_B() {
		System.out.println("method_B " + msg);
	}
	
}
class A extends B{
	public A() {
		//super.super();
		System.out.println("A");
	}
	public void method_A() {
		System.out.println("method_A "  + msg);
	}
	public void method() {
//		System.out.println("methods " + msg);
	}
	
}
public class InherEx2 {

	public static void main(String[] args) {
		A a = new A();
		B b = a;
		C c = b;
		
		A z = (A)c;
		A y = (A)b;
		B h = (A)c;
		
		Object o1 = a;
		Object o2 = b;
		Object o3 = c;
		
		int[] abc = new int[2];
		Object[] obj_arr = new Object[2];
		
		abc[0] = 10;
		obj_arr[0] = a;
		
		A k = (A)obj_arr[0];
		
		a.method();
		a.method_A();
		a.method_C();
		System.out.println(a.num);
//		System.out.println(c.num);

	}

}
