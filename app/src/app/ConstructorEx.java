package app;

public class ConstructorEx {
	int i = 0;
	public ConstructorEx() {
		this(100); // - this.°ú 
		i = 50;
	}
	public ConstructorEx(int a) {
		this("A");
		System.out.println("a = " + a);
	}
	public ConstructorEx(String s) {
		System.out.println("s = " + s);
	}
	
	public static void main(String[] args) {
		ConstructorEx obj = new ConstructorEx("A");
		System.out.println(obj.i);
	}

}
