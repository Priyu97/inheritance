package inheritance;

class Student1{
	int x;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		System.out.println("I am setting X non");
		this.x=x;
	}
	public void printMe() {
		System.out.println("I am a constructor");
	}
}
class Teachar extends Student1{
	int y;
	
	public int getY() {
		return y;	
	}
	public void setY(int y) {
		System.out.println("I am setting Y non");
		this.y=y;
	}
	public void printMe1() {
		System.out.println("I am a constructor");
	}
	
}
public class Inheritance{

	public static void main(String[] args) {
		Teachar y = new Teachar();
		y.printMe1();
		y.printMe();
		y.setY(66);
		System.out.println(y.getY());
		Student1 x = new Student1();
		x.printMe();
		x.setX(25);
		System.out.println(x.getX());
	}

}
