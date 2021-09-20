package api;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx7 {

	public static void main(String[] args) throws IOException{
		File file = new File("C:/Users/dldnj/Desktop/자기개발/작업/JAVA/IOtest.txt");
		FileOutputStream fos = new FileOutputStream(file);
		String str = "ABC";
		byte[] data = str.getBytes();
		for(int i = 0; i < data.length; i++) {
			fos.write(data[i]);
		}
		fos.flush();
		fos.close();
	}

}
