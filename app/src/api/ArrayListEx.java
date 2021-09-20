package api;

import java.util.ArrayList;
/*
   객체를 담을 수 있는 기억장소

*/
public class ArrayListEx {

   public static void main(String[] args) {
      ArrayList list = new ArrayList();
      list.add("JAVA");
      list.add("JDBC");
      list.add("Servlet");
      list.add(1, "DB");
      int size = list.size();
      System.out.println("총 객체수 : " + size);
      System.out.println("요소 출력 : " + list.get(2));
      for(int i = 0; i < list.size(); i++) {
         String str = (String)list.get(i);
         System.out.println(i + " : " + str);
      }
      System.out.println();
      list.remove(2);
      Object skill = (String)list.get(2);
      System.out.println("2 : " + skill);
      list.remove(2);
//    skill = (String)list.get(2);
//    System.out.println("2 : " + skill);
      System.out.println();
      for(Object obj : list) {
          System.out.println(obj.toString());
      }
   }

}