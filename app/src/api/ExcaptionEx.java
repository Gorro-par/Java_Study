package api;

//Ű���� �Է�, ���� ó��, ��Ʈ�� ó��,DB ó�� �� �ܺο��� �۾��� �ϴ� ���
//����ġ ���� ������ �߻��� �� �����Ƿ� �ڹٿ����� �ݵ�� ����ó���� �ϵ��� �ִ�

public class ExcaptionEx {
	String str = "";
	public void foo(int i) {
		try {
			if (i == 1) {
				throw new Exception();
			}
			str += " 1 ";
		}catch(Exception e) {
			str += " 2 ";
			return;
		}finally {
			str += " 3 ";
		}
		str += " 4 ";
	}
	public static void main(String[] args) {
		ExcaptionEx e = new ExcaptionEx();
		e.foo(0);
		e.foo(1);
		System.out.println(e.str);
//		char c = (char)System.in.read();
//		int[] arr = new int[1];
//		System.out.println(arr[1]);
		
		
//			String str = "A";
//			Object member = str;
//			Member m = (Member)member;
//		try {
//			���ܹ߻�����
//			�����ڵ� 1
//			char c = (char)System.in.read();
//			�����ڵ� 2
//			�����ڵ� 3
//		}catch(Exception e) {
//			����ó������
//		}finally {
//			�ݵ�� �����ϴ�����
		}
	}


