package api;

public class StringSplitEx {
	public static void main(String[] args) {
		String text = "�����&���Ѽ�,����,�챤��-��±�";
		String[] names = text.split("&|,|-");//�߶��
		for(String name : names) {
			System.out.println(name);
		}
	}
}


