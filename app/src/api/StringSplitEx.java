package api;

public class StringSplitEx {
	public static void main(String[] args) {
		String text = "°ûÃá½Ä&°íÇÑ¼®,±è´ë½Ä,¿ì±¤¼®-±è½Â±¤";
		String[] names = text.split("&|,|-");//Àß¶ó³Û
		for(String name : names) {
			System.out.println(name);
		}
	}
}


