package api;

public class StringReplaceEx {

	public static void main(String[] args) {
		String oldStr = "�ڹٴ� ��ü������ �Դϴ�, ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}