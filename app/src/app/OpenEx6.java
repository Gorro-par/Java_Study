package app;

/*
증가, 감소 연산자  
형식)
	--a;	// => 결과 : 1 
	++a;	// => 결과 : 0
	
	a++
	a--
	
 */

public class OpenEx6 {

	public static void main(String[] args) {
		int su = 0;
		su++;
		System.out.println(su++);
		System.out.println(su);
		
		int a = 0;
		System.out.println(a++ + a++);
		System.out.println(a + --a + ++a);
		System.out.println(--a + a++);
		System.out.println(a);

	}

}
