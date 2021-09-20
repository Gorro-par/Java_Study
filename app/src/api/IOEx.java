package api;

import java.io.IOException;

/*
	��Ʈ�� : �Ϲ������� ������, ��Ŷ ���� �Ϸ��� ���Ӽ��� ���� �帧
	��,��� ��Ʈ��: �����͸� �а� ���� ������ ���α׷��� ������ �𵨸�
	����: ����ó�� �ӽ������� ��Ƶδ°���
	
	�ڹ� ����� ��Ʈ�� ����
	- �� �������� �帧
	- ���۸� ���� �� �ִ�
	- FIFO(First In First Out)�� ����
	- ����(CHaracter Stream), ����Ʈ(byte Stream)���� �з� ��
	
	
	����(Character Stream)���� �ֻ��� ��Ʈ��
	Reader class
		�Է� ��Ʈ��
	Writer class
		��� ��Ʈ��
		
	����Ʈ(byte Stream) ����Ʈ �ֻ��� ��Ʈ��
	InputStream class
		�Է� ��Ʈ��
	OutputStream
		��� ��Ʈ��
 */
public class IOEx {

	public static void main(String[] args) {
		System.out.println("�Է� : ");
		char c = ' ';
		try {
			c = (char)System.in.read();
		}catch(IOException e) {
			e.printStackTrace();
		}System.out.println("��� : " + c);

	}

}
