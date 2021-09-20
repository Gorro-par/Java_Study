package api;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx8 {
//입력시 메모장에 저장
	
	public static void main(String[] args) throws IOException{
		File file = new File("C:/Users/dldnj/Desktop/자기개발/작업/JAVA/IOtest.txt");
		FileOutputStream fos = new FileOutputStream(file);
		System.out.print("입력 : ");
		int output = 0;
		while(output != -1) {
			output = System.in.read();
			fos.write(output);
		}
		fos.close();

	}

}
