package app;

//�ݺ���(for��)
/*ǥ��)
for (���� ����(�ʱ�ȭ); ���ǽ�; ���� Ȥ�� ���� ����){
	���� ����;
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
//		System.out.println("��� : " + sum);
		int sum = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 2 == 0) {
				sum += i; // sum = sum + i;
				System.out.println("��� : " + sum);
			}
		}
		
		
	}

}
