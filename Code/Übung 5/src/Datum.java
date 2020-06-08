
public class Datum {
	public int tag;
	public int monat;
	public int jahr;
	public boolean Fehler;

	public Datum(int t, int m, int j) {
		if ((t >= 1 && t <= 31) && (m >= 1 && m <= 12)) {
			tag = t;
			monat = m;
			jahr = j;
			Fehler = false;
		}
		if (t < 1 || t > 31) {
			Fehler = true;
			System.out.println("Tage muss zwischen 1 bis 31 sein.");
		}
		if (m < 1 || m > 12) {
			Fehler = true;
			System.out.println("Monate muss zwischen 1 bis 12 sein.");
		}
	}

	public void druckeDatum() {
		if (Fehler == false) {
			System.out.println("Datum: " + tag + "." + monat + "." + jahr);
		} else {
			System.out.println("Fehler.");
		}
	}
}
