package api;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx8 {
//�Է½� �޸��忡 ����
	
	public static void main(String[] args) throws IOException{
		File file = new File("C:/Users/dldnj/Desktop/�ڱⰳ��/�۾�/JAVA/IOtest.txt");
		FileOutputStream fos = new FileOutputStream(file);
		System.out.print("�Է� : ");
		int output = 0;
		while(output != -1) {
			output = System.in.read();
			fos.write(output);
		}
		fos.close();

	}

}
