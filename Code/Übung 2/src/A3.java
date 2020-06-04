
public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=42;
		if(x%2==0) {
			System.out.println("a");
		}
		else {
			System.out.println("b");
		}
		int y=42;
		boolean printNumber = true;
		if(y<0) {
			System.out.println("Fehler: Negativ Zahl");
		}
		else if(y%2==0) {
			if(printNumber == true) {
				System.out.println("Gerade Zahl:"+y);
			}
			else {
				System.out.println("Gerade Zahl");
			}
		}
		else {
			System.out.println("Ungerade Zahl");
		}
	}

}
