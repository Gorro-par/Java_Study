package app;
/*
 	�� ������
 	|
 	&
 	||
 	&&
 	����1) boolean result = ���ǽ�1 | ���ǽ�2 ;
 	ex1-1)
 	�� = �� | ����
 	ex1-2)
 	�� = ���� | ��
 	ex1-3)
 	�� = �� | ��
 	ex1-4)
 	���� = ���� | ����
 	
 	����2) boolean result = ���ǽ�1 || ���ǽ�2;
 	ex2-1)
 	�� = �� || ����
 	ex2-2)
 	�� = ���� || ��
 	ex2-3)
 	�� = �� || ��
 	ex2-4)
 	���� = ���� || ����
 	
 	����3) boolean result = ���ǽ�1 & ���ǽ�2;
 	ex3-1)
 	���� = �� & ����
 	ex3-2)
 	���� = ���� & ��
 	ex3-3)
 	�� = �� & ��
 	ex3-4)
 	���� = ���� & ����
 
  	����4) boolean result = ���ǽ�1 && ���ǽ�2;
 	ex4-1)
 	���� = �� && ����
 	ex4-2)
 	���� = ���� && ��
 	ex4-3)
 	�� = �� && ��
 	ex4-4)
 	���� = ���� && ����
 	
*/

public class OpenEx4 {

	public static void main(String[] args) {
		boolean result = 3 < 5 || 5 < 3;
		System.out.println(result);
		
		boolean a = 3 > 5;
		boolean b = 5 > 5;
		result = a || b;
		
		boolean c = true;
		boolean d = false;
		result = c | d;
		System.out.println(result);
		
		int sum = 0;
		a = true;
		b = false;
		result = a || 10 > (sum = 3 + 5); // result = �� | ��
		System.out.println(result);
		System.out.println(sum);
		
		sum = 0;
		a = false;
		result = a & 10 > (sum = 3 + 5); // result = ���� & ��
		System.out.println(result);
		System.out.println(sum);
	}

}
