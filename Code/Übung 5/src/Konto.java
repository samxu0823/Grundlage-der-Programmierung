
public class Konto {
	public int kontonummer;
	public double kontostand;

	/**
	 * Erstellung der Konto
	 * 
	 * @param k Kontonummer
	 */
	public Konto(int k) {
		kontonummer = k;
		kontostand = 0;
		System.out.println("Erstellungserfolg.");
		System.out.println("kontonummer: " + k);
		System.out.println("kontostand: " + kontostand);
		System.out.println(" ");
	}

	/**
	 * Geldeinzahlung
	 * 
	 * @param ein eingezahlter Geld
	 * @return Ob die Transaktion funktioniert
	 */
	public boolean einzahlen(double ein) {
		boolean Transaktion = true;
		if (ein > 0) {
			kontostand = kontostand + ein;
		} else {
			System.out.println(kontonummer + ": Die Buchung konnte nicht ausgef¨¹hrt werden.");
			Transaktion = false;
		}
		return Transaktion;
	}

	/**
	 * Geldauszahlung
	 * 
	 * @param aus ausgezahlter Geld
	 * @return Ob die Transaktion funktioniert
	 */
	public boolean auszahlen(double aus) {
		boolean Transaktion = true;
		if (aus > 0 && kontostand - aus >= 0) {
			kontostand = kontostand - aus;
		} else {
			System.out.println(kontonummer + ": Die Buchung konnte nicht ausgef¨¹hrt werden.");
			Transaktion = false;
		}
		return Transaktion;
	}

	/**
	 * Ausgabe des Kontozustands
	 */
	public void kontozustand() {
		System.out.println("Kontostand der Nr." + this.kontonummer + ": " + this.kontostand);
	}
}
