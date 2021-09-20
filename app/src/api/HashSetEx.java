package api;

import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<Member> set = new HashSet<>();
		set.add(new Member("È«±æµ¿", 10));
		set.add(new Member("È«±æµ¿", 10));
		System.out.println("ÃÑ °´Ã¼¼ö : " + set.size());
		System.out.println(new Member("È«±æµ¿", 10).equals(new Member("È«±æµ¿", 10)));
		System.out.println(new Member("È«±æµ¿", 10).hashCode());
	}
}
