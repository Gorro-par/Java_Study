package app;

/*
 * 	표현)
 * 	for( 변수 선언(초기화); 조건식; 증가 혹은 감소 수식){
 * 		실행 구문 1;		
 * 		for(변수 선언(초기화; 조건식; 증가 혹은 감소 수식){
 * 			실행 구문 2;
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
		
//		응용문제) 구구단 9단까지 출력하세요
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


	
