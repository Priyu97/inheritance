package inheritance;

public class Pyplot {
	public void kalkg() {
		System.out.println("hello priyu!");
	}
	public void kalkg(int x) {
		int x1=x;
		System.out.println("hello!="+x);
		
	}
	public void kalkg(int x,int y) {
		int x1=x;
		int y1=y;
		System.out.println("hello p!="+x);
		System.out.println("hello pri!="+y);
	}
	public void kalkg(int x,int y,String z) {
		int x1=x;
		int y1=y;
		String z1=z;
		System.out.println("hello prity!="+x);
		System.out.println("hello pri!="+y);
		System.out.println("hello p!="+z);
	}
	public static void main(String args[]) {
		Pyplot n = new Pyplot();
		n.kalkg();
		n.kalkg(10);
		n.kalkg(10, 20);
		n.kalkg(10, 20, "demo");
	}
	

}
