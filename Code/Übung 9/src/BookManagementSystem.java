
public class BookManagementSystem {
	public static void main(String[] args) {
		Book ir1 = new Book("Software Ecosystems");
		Book ir2 = new Book("Hardware Ecosystems");
		// Check if both books are equal.
		
		if (ir1 == ir2) {
			System.out.println("The books are duplicates!");
		} else {
			System.out.println("The books are NO duplicates!");
		}
		System.out.println(isDuplicate(ir1, ir2));
	}
	public static boolean isDuplicate(Book b1, Book b2) {
		if (b1.getTitle()==b2.getTitle()){
			return true;
		}
			return false;
	}
	
}
