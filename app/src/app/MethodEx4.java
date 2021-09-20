package app;

public class MethodEx4 {
	
	static void method(int ...num) {
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
	public static void main(String[] args) {
		method(1, 3, 45, 6);

	}

}
