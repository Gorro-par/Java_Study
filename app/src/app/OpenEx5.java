package app;

/*
연산후 대입 연산자
형식)
	+=
	-=
	*=
	/=
	%=
	ex)
		int su = 5;
		su += 10; -> su = su + 10;
		su %= 10; -> su = su % 10;
 */
public class OpenEx5 {

	public static void main(String[] args) {
		int su1 = 10, su2 = 20, sum = 0;
		sum = su1 + su2;
//		sum += 10; // sum = sum + 10;
		sum = sum + 10;
		System.out.println(sum);

//		...
		
		sum %= 3;
		System.out.println(sum);
	}

}
