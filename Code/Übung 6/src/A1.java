
public class A1 {
//	Define the static Variable
	static int a;
//Define the Class Variable
	int b = 2;

//	Define the Constructor(With Parameter)
	public A1(String A1) {
		System.out.println(A1);
	}

//	Define the Constructor(Without Parameter)
	public A1() {
//		Use Case of this: Reference of the constructor
		this("Mit Parameter");
		System.out.print("Ohne Parameter");
	}

//	Define the static Method
	public static int getStaticParameter() {
		return a;
	}

//	Define the Class Method
	public int getParameter() {
		return b;
	}

	public static void main(String[] args) {
//		Use static Method without initialization
		int c = A1.getStaticParameter();
//		Use Class Method with initialization
		A1 a1 = new A1();
		int d = a1.getParameter();
		System.out.println(c);
		System.out.println(d);
	}
}
