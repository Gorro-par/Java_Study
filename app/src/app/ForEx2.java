package app;

/*
 * 	ǥ��)
 * 	for( ���� ����(�ʱ�ȭ); ���ǽ�; ���� Ȥ�� ���� ����){
 * 		���� ���� 1;		
 * 		for(���� ����(�ʱ�ȭ; ���ǽ�; ���� Ȥ�� ���� ����){
 * 			���� ���� 2;
 * 		}
 * 	}	
 */
public class ForEx2 {

	public static void main(String[] args) {
//		for( int i = 0; i < 10; i++) {
////			System.out.println("one");
//			for( int j = 0; j < 10; j++) {
//				System.out.println("two\t");
//			}
//			System.out.println();
		
//		���빮��) ������ 9�ܱ��� ����ϼ���
//		for (int i =1; i < 10; i ++) {
//			for(int j = 2; j < 10; j++) {
//				System.out.print(j+ " * "+i+" = "+(j*i)+"\t");
//				}
//			System.out.println();
//			}
		for(int i = 1; i <= 6; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}


	
