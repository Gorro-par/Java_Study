package api;

import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Scanner;

public class VectorEx {
//��ü ����
	public static void main(String[] args) {
		Vector vc = new Vector();
		vc.add("qwe");
		vc.add("asd");
		vc.add("zxc");
		//��ü ����
		String str1 = (String)vc.get(0);
		String str2 = (String)vc.get(1);
		String str3 = (String)vc.get(2);
		//���
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println("�̸��� �Է��ϼ��� : ");
		String name = new Scanner(System.in).next();
		int index = vc.indexOf(name);
		if(vc.contains(name)) {
			System.out.println("�˻���� ���� : " + vc.get(index));
			if(vc.remove(name)) {
				System.out.println("���� �Ϸ�!");
			}
			System.out.println("��� ��� ǥ��");
			for(int i = 0; i <vc.size(); i++) {
				String str = (String)vc.get(i);
				System.out.println("��� ��� ǥ��2");
				Iterator it = vc.iterator();
				while(it.hasNext()) {
					String e = (String)it.next();
					System.out.println(e);
				}
				System.out.println("��� ��� ǥ��3");
				Enumeration a = vc.elements();
				while(a.hasMoreElements()) {
					String st = (String)a.nextElement();
					System.out.println(st);
				}
				System.out.println("��� ��� ǥ��4");
				for(Object obj : vc) {
					String strr = (String)obj;
					System.out.println(strr);
				}
				
			}
			
		}else {
			System.out.println("�˻������ �����ϴ�");
		}
		
	}

}
