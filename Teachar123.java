package inheritance;

public class Teachar123 {
	int x;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public static void main(String[] args) {
		Teachar123 b = new Teachar123();
		b.setX(45);
		System.out.println("x value is:"+b.getX());
	}

}
