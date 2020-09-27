
public class Test extends Exam {
	public int Grade;
	public Test(int Grade, int note) {
		super(note);
		this.Grade=Grade;
	}
	public static void main(String []args) {
		Exam a = new Test(1, 99);
	}
}
