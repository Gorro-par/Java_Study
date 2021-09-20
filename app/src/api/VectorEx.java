package api;

import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;

public class VectorEx {
//객체 저장
	public static void main(String[] args) {
		Vector vc = new Vector();
		vc.add("qwe");
		vc.add("asd");
		vc.add("zxc");
		//객체 추출
		String str1 = (String)vc.get(0);
		String str2 = (String)vc.get(1);
		String str3 = (String)vc.get(2);
		//출력
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println("이름을 입력하세요 : ");
		String name = new Scanner(System.in).next();
		int index = vc.indexOf(name);
		if(vc.contains(name)) {
			System.out.println("검색결과 있음 : " + vc.get(index));
			if(vc.remove(name)) {
				System.out.println("삭제 완료!");
			}
			System.out.println("출력 결과 표현");
			for(int i = 0; i <vc.size(); i++) {
				String str = (String)vc.get(i);
				System.out.println("출력 결과 표현2");
				Iterator it = vc.iterator();
				while(it.hasNext()) {
					String e = (String)it.next();
					System.out.println(e);
				}
				System.out.println("출력 결과 표현3");
				Enumeration a = vc.elements();
				while(a.hasMoreElements()) {
					String st = (String)a.nextElement();
					System.out.println(st);
				}
				System.out.println("출력 결과 표현4");
				for(Object obj : vc) {
					String strr = (String)obj;
					System.out.println(strr);
				}
				
			}
			
		}else {
			System.out.println("검색결과가 없습니다");
		}
		
	}

}
