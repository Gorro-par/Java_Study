package app;

public class ArrayEx3 {
//	다차원배열(array) 행과 열
	/*
	  표현)
	  - int [][] arr = new int [n][n];
	  - int [][] arr = {
	  						{10, 20},
	  						{30, 40},
	  						(50, 60)
	  					};
	 */
	public static void main(String[] args) {
		int[][] arr = new int [3][2];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[1][0] = 3;
		arr[1][1] = 4;
		arr[2][0] = 5;
		arr[2][1] = 6;
		System.out.println("arr[0][0] = " + arr[0][0]);
		System.out.println("arr[0][1] = " + arr[0][1]);
		System.out.println("arr[1][0] = " + arr[1][0]);
		System.out.println("arr[1][1] = " + arr[1][1]);
		System.out.println("arr[2][0] = " + arr[2][0]);
		System.out.println("arr[2][1] = " + arr[2][1]);
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.println("arr[" + i +"][" + j + " ] = " + arr[i][j]);
			}
		}
	String[][] str = {{"A","B","C"},{"D","E","F"},{"G","H","I"}};
//	문제1) 총합과 평균
	double a = 0;
	int b = 0;
	int[][] array = {{95, 86},{83, 92, 96},{78, 83, 93, 87, 88}};
	for(int i = 0; i<3; i++) {
		for(int j = 0; j<array[i].length; j++ ) {
			a +=array[i][j];
			b += 1;
		}
	}
	System.out.println("총합 : " + a);
	System.out.println("평균 : " + a/b);
	
//	문제2) 최대값 출력
	int c = 0;
	int [] array2 = {1, 5, 3, 8, 2};
	for(int i = 0; i < array2.length; i++) {
		if(c < array2[i]) {
			c = array2[i];
		}
	}
	System.out.println("최대값 : " + c);
	}
	

}
