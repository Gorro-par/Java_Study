package api;

import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<Member> set = new HashSet<>();
		set.add(new Member("ȫ�浿", 10));
		set.add(new Member("ȫ�浿", 10));
		System.out.println("�� ��ü�� : " + set.size());
		System.out.println(new Member("ȫ�浿", 10).equals(new Member("ȫ�浿", 10)));
		System.out.println(new Member("ȫ�浿", 10).hashCode());
	}
}
