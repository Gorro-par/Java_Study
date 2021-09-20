package api;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableEx {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		map.put("a1", "��1");
		map.put("a2", "��2");
		map.put("a3", "��3");
		String result = map.get("a1");
		System.out.println(result);
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		map.remove("a1");
		while(it.hasNext()) {
			String key = it.next();
			String val = map.get(key);
			System.out.println("Ű : " + key + "\t�� : " + val);

			
		}
		map.remove("a1");
		System.out.println("�� ��Ʈ���Ǽ� : " + map.size());
		
		keySet = map.keySet();
		it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String val = map.get(key);
			System.out.println("Ű : " + key + "\t�� : " + val);

			
		}
	}

}
