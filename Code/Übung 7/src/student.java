
public class student {
	int matrikelnr;
	String vorname;
	String nachname;
	noteList leistungsspiegel;
	static int anzahlStudierende = 0;

	public student(String vorname, String nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.matrikelnr = 1000 + anzahlStudierende;
		anzahlStudierende++;

	}
}
