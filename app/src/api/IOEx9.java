package api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;



public class IOEx9 {

   public static void main(String[] args) throws IOException{
      File file = new File("C:/Users/dldnj/Desktop/자기개발/작업/JAVA/IOtest.txt");
      FileWriter fwriter = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fwriter);
      PrintWriter pw = new PrintWriter(bw, true);
      InputStream is  = System.in;
      InputStreamReader isr = new InputStreamReader(is);
      BufferedReader br = new BufferedReader(isr);
      System.out.print("입력 : ");
      String str = "";
      while(!str.equals("end")) {
         str = br.readLine();
         pw.println(str);
         bw.write(str);
      }      
      br.close();
      pw.close();
      bw.flush();
      bw.close();
      
   }

}