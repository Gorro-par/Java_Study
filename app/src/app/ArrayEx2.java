package app;

public class ArrayEx2 {

	public static void main(String[] args) {
//		����1)
//		int[] score = {83, 90, 87 };(���� ��� ���)
		int[] score = {83, 90, 87};
//		int j = 0;
//		for(int i = 0; i < score.length; i++) {
//			j += score[i];
//		}
//		double b = j;
//		System.out.println(b);
//		System.out.println(b / score.length);
//		����2) 
//		int su[] = {3, 6, 4 ,7, 10} // ¦���� ����ϼ���
//		int su[] = {3, 6, 4, 7, 10};
//		for (int i =0;i < su.length; i++) {
//			if(su[i]%2  == 0) {
//				System.out.println(su[i]);
//			}
			
//		}
		
		
//		����3) ��������3, 7 ���� ���� ����迭�� �����ϼ���
		int[] result = new int[2];
//		int a = 0, b = 0;
//		for (int i = 1; i < 10; i++) {
//			a += 3 * i;
//			b += 7 * i;
//		}
//		result[0] = a;
//		result[1] = b;
//		System.out.println(result[0]);
//		System.out.println(result[1]);
		
		int[] dan = {3, 7};
		for(int i = 0; i < 2; i++) {
			for(int j = 1; j < 10; j++) {
				result[i] += dan[i] * j;
			}
		}
		for(int val : result) {
			System.out.println(val);
		}
	}
	

}
