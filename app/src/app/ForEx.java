package app;

//반복문(for문)
/*표현)
for (변수 선언(초기화); 조건식; 증가 혹은 감소 수식){
	실행 구문;
}
 */
public class ForEx {

	public static void main(String[] args) {
		int m = 0;
		for(int i = 0; i < 101; i++) {
			m = i + m;
		}
		System.out.println(m);
//		int sum = 0;
//		for(int i = 1; i <= 100; i++) {
//			sum += i;// sum = sum + i
//		}
//		System.out.println("결과 : " + sum);
		int sum = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 2 == 0) {
				sum += i; // sum = sum + i;
				System.out.println("결과 : " + sum);
			}
		}
		
		
	}

}
