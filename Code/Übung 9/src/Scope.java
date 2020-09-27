
public class Scope {
	public static int foo = 42;

	public static void main(String[] args) {
		System.out.println(foo);
		int foo = 0;
		System.out.println(foo);
		foo = Scope.foo + 1;
		{
			int bar = 5;
			System.out.println(bar);
			System.out.println(foo);
//			foo = 0;
		}
		System.out.println(foo);
//		bar = foo + 1;
		qux(Scope.foo);
	}

	static void qux(int baz) {
		int foo;
		{
//			int baz;
			System.out.println(baz);
		}
	}
}
