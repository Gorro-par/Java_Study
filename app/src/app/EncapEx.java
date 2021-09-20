package app;

public class EncapEx {
	int a;

	public static void main(String[] args) {
		Encap encap = new Encap();
		System.out.println(encap.a);
		System.out.println(encap.b);
		System.out.println(encap.c);
//		System.out.println(encap.d);
		encap.setD(100);
		int result = encap.getD();
		System.out.println(result);
	}	

}

class Encap {
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
}
