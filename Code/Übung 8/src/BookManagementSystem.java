
public class BookManagementSystem {
	public static void main(String []args) {
		SchoolBook myComputerBook = new SchoolBook();
		myComputerBook.title = "Java ist auch eine Insel";
		myComputerBook.pagecount = 1308;
		myComputerBook.gradeLevel = 42;
		System.out.println(myComputerBook);
		
		CookBook myCookBook = new CookBook(true);
		myCookBook.title = "Vegetarisch Kochen f¨¹r Fortgeschrittene";
		myCookBook.pagecount= 84;
		System.out.println(myCookBook);
		
		Book myBook = myCookBook;
		System.out.println(myBook);
	}
}
