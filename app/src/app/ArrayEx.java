package app;
/*
 * 배열(array)
 * 	- 같은 자료형의 데이터를 여러개 저장하기 위한 메모리 공간을 말함.
 * 	- 생선된 메모리 공간에 index를 이용하여 각 기억장소를 구분함.
 * 	- 배열크기는 length를 사용하여 구함.
 * 표현)
 * int a = 10;
 * int[] b = {10, 20};
 * int[] c = new int[]{10, 20}
 * 
 * 
 */
public class ArrayEx {
	public static void main(String[] args) {
//		ex1)
//		int[] a = new int[2];
//		a[0] = 10;
//		System.out.println(a[0]);
//		a[1] = 20;
//		System.out.println(a[1]);
//		반복문 사용으로 출력
//		for (int i = 0; i <2; i++) {
//			a[i] = 10 * (i + 1);
//			System.out.println(a[i]);
//		}
//		
//		for(int b : a) {
//			System.out.println(b);
//		}
		
//		ex2)
//		int[] b = {10, 20};
//		System.out.println(b[0]);
//		System.out.println(b[1]);
		
//		ex3)
//		int[] c = new int[]{10, 20};
//		System.out.println(c[0]);
//		System.out.println(c[1]);
		
//		문제) 배열범위 구구단을 출력
//		int[] dan = {3,7,9};
//		int d= dan[2];
//		for(int i = 1; i <10; i++) {
//			System.out.println(d + "*" + i + "=" +  d * i);
//		}
		
		
		
		
//		ex2)
		int[] a = {3, 7 ,9};
		int b = a[2];
		for(int i = 0; i < a.length; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(a[i] + "*" + j + (a[i] * j));
			}
			System.out.println();
		}
		
	}
}