package app;

public class MethodEx2 {
	static void method1(int a) {
		int b = 0;
		for (int i = 1; i <= a; i++) {
			b += i;
		}
		System.out.println("���1 : " + b);
		
	}

	public static void main(String[] args) {
// 		����1) 1 ~ 10 ������ ���� ����Ͻÿ�.(Method ���)
		method1(100);
	}

}
