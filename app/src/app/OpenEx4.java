package app;
/*
 	논리 연산자
 	|
 	&
 	||
 	&&
 	형식1) boolean result = 조건식1 | 조건식2 ;
 	ex1-1)
 	참 = 참 | 거짓
 	ex1-2)
 	참 = 거짓 | 참
 	ex1-3)
 	참 = 참 | 참
 	ex1-4)
 	거짓 = 거짓 | 거짓
 	
 	형식2) boolean result = 조건식1 || 조건식2;
 	ex2-1)
 	참 = 참 || 거짓
 	ex2-2)
 	참 = 거짓 || 참
 	ex2-3)
 	참 = 참 || 참
 	ex2-4)
 	거짓 = 거짓 || 거짓
 	
 	형식3) boolean result = 조건식1 & 조건식2;
 	ex3-1)
 	거짓 = 참 & 거짓
 	ex3-2)
 	거짓 = 거짓 & 참
 	ex3-3)
 	참 = 참 & 참
 	ex3-4)
 	거짓 = 거짓 & 거짓
 
  	형식4) boolean result = 조건식1 && 조건식2;
 	ex4-1)
 	거짓 = 참 && 거짓
 	ex4-2)
 	거짓 = 거짓 && 참
 	ex4-3)
 	참 = 참 && 참
 	ex4-4)
 	거짓 = 거짓 && 거짓
 	
*/

public class OpenEx4 {

	public static void main(String[] args) {
		boolean result = 3 < 5 || 5 < 3;
		System.out.println(result);
		
		boolean a = 3 > 5;
		boolean b = 5 > 5;
		result = a || b;
		
		boolean c = true;
		boolean d = false;
		result = c | d;
		System.out.println(result);
		
		int sum = 0;
		a = true;
		b = false;
		result = a || 10 > (sum = 3 + 5); // result = 참 | 참
		System.out.println(result);
		System.out.println(sum);
		
		sum = 0;
		a = false;
		result = a & 10 > (sum = 3 + 5); // result = 거짓 & 참
		System.out.println(result);
		System.out.println(sum);
	}

}
