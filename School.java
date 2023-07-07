package inheritance;

public class School extends Book_Price{

	public static void main(String[] args) {
		Topic t = new Topic();
		t.get_book();
		t.get_java_topic();
		t.get_cpp_topic();
		t.get_c_topic();
		t.get_price();

	}

}
