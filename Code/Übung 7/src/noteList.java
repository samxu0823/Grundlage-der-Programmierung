
public class noteList {
	examination[] Klausuren;
	int anzahlKlausuren = 0;

	public noteList(int length) {
		this.Klausuren = new examination[length];
	}

	public void klausurEintragen(examination k) {
		if (anzahlKlausuren == this.Klausuren.length) {
			System.out.println("Fehler: Es kann keine weitere Klausur eingetragen werden.");
		} else {
			Klausuren[anzahlKlausuren] = k;
			anzahlKlausuren++;
			System.out.println("Es wurde die " + anzahlKlausuren + ". Klausur " + k.name + " gespeichert.");
		}

	}
}
