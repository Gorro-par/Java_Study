package app;

public class MethodEx3 {
	
/*
 	static ? method(int dan1, int dan2){
 		dan1 = 3;
 		dan2 = 7;
 		3 ~ 7 단 출력 구문
 	}
 	
 	static ? method2({2, 5, 7, 3}){
 	{2, 5, 7, 3} 범위 단 출력
 	
 */
	
//	static void method1(int dan1, int dan2) {
//		for(int i = 1; i <= 9; i ++) {
//			for(int j = dan1; j <= dan2; j++) {
//				System.out.print(j + " * " + i + " = " + i*j + "\t");
//			}
//			System.out.println();
//		}
//	}
	
	static void method1(int dan1, int dan2) {
		for(int j = dan1; j <= dan2; j++) {
			for(int i = 1; i < 10; i++) {
				System.out.println(j+ " * " + i + " = " + (j*i));
			}
			System.out.println();
		}
	}
	
	static void method2(int[] arr) {
//		{2, 5, 7, 3} 범위 단 출력
		for(int dan : arr) {
			for(int i = 1; i < 10; i++) {
				System.out.println(dan + " * " + i +  " = " + (dan * i));
			}
			System.out.println();
		}
			
	}

	public static void main(String[] args) {
//		문제) dan1, dan2 args로 만들어 사용(method) 범위 사용
//		method1(3,7);
		int dan1 = Integer.parseInt(args[0]);
		int dan2 = Integer.parseInt(args[1]);
		method1(dan1, dan2);
		
//		문제2)배열 범위의 단 출력 (int array[] = {2, 5, 7, 3}) method에 인자로 전달하여 사용
		int array[] = {2, 5, 7, 3};
		method2(array);
	}	

}
