
public class Konto {
	int kontonummer;
	double kontostand;
	public Konto(int kontonummer) {
		this.kontonummer=kontonummer;
		this.kontostand=0;
	}
	public boolean einzahlen(double betrag) {
		if (betrag > 0) {
			kontostand = kontostand + betrag;
			return true;
		} else {
			return false;
		}
	}
	public boolean auszahlen(double betrag) {
		if (betrag > 0 && kontostand >= betrag) {
			kontostand = kontostand - betrag;
			return true;
		} else {
			return false;
		}
	}
	public void druckeKontoauszug() {
		System.out.println("Kontonummer: "+this.kontonummer);
		System.out.println("Kontostand: "+this.kontostand);
	}
}
