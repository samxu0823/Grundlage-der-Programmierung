
public class Book {
	private String title;

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public boolean equals(Object b1) {
		if (b1 instanceof Book) {
			Book b= (Book) b1;
			if(this.title.equals(b.getTitle())) {
				return true;
			}
		}
			return false;
		}

}
