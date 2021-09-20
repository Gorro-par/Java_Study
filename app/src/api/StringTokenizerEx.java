package api;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		String text = "���쿣/�پﶱ/�����";
		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
//		while(st.hasMoreElements()) {
//			Object el = st.nextElement();
//			System.out.println(el.toString());
//		}
		for(int i = 0; i < countTokens; i++) {
			String el = st.nextToken();
			System.out.println(el.trim());
		}
	}

}
