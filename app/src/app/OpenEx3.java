package app;

/*
 ���� ������
 - ����)
 �������� ���� = ���ǽ� ? ��1 : ��2;
 */

public class OpenEx3 {
	public static void main(String[] args) {
		int a  = 3 < 5 ? 10 : 20 ; // int = String = char �� ����
		System.out.println(a);
		
		int su1 = 10, su2 = 20;
		String result = su1 > su2 ? "��" : "����";
		System.out.println("��� : " + result);
	}

}
