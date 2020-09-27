
public class CookBook extends Book {
	boolean vegetarian;

	public CookBook(boolean TF) {
		this.vegetarian = TF;
	}

	public boolean isVegetarian() {
		boolean TF;
		if (this.vegetarian == true) {
			TF = true;
		} else {
			TF = false;
		}
		return TF;
	}

	public String toString() {
		super.toString();
		return super.toString()+"Kochbuch Vegetarisch?" + this.vegetarian;
	}

}
