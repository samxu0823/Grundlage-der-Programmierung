
public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jahre[] = {1800, 1900, 1950, 1968, 1969, 1990, 2000, 2001, 2002,
				2010, 2011, 2012, 2013, 2014};
		for (int i = 0; i < jahre.length; i++) {
			int j = jahre[i];
			if (j % 4 == 0 && (j % 400 == 0 || j % 100 != 0)) {
				System.out.println("Das Jahr " + j + " ist ein Schaltjahr.");
			}
			else {
				System.out.println("Das Jahr " + j + " ist KEIN Schaltjahr.");
			}
		}
	}

}
