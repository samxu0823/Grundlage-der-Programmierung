
public class Sparkonto {
	public int kontonummer;
	public double kontostand;
	public static double zinssatz;

	/**
	 * Erstellung der Konto
	 * 
	 * @param k Kontonummer
	 */
	public Sparkonto(int kontonummer) {
		this.kontonummer = kontonummer;
		kontostand = 0;
		System.out.println("Erstellungserfolg.");
		System.out.println("kontonummer: " + kontonummer);
		System.out.println("kontostand: " + kontostand);
		System.out.println(" ");
	}

	/**
	 * Geldeinzahlung
	 * 
	 * @param betrag eingezahlter Geld
	 * @return Ob die Transaktion funktioniert
	 */
	public boolean einzahlen(double betrag) {
		boolean Transaktion = true;
		if (betrag > 0) {
			kontostand = kontostand + betrag;
		} else {
//			System.out.println(kontonummer + ": Die Buchung konnte nicht ausgef¨¹hrt werden.");
			Transaktion = false;
		}
		return Transaktion;
	}

	/**
	 * Geldauszahlung
	 * 
	 * @param betrag ausgezahlter Geld
	 * @return Ob die Transaktion funktioniert
	 */
	public boolean auszahlen(double betrag) {
		boolean Transaktion = true;
		if (betrag > 0 && kontostand - betrag >= 0) {
			kontostand = kontostand - betrag;
		} else {
//			System.out.println(kontonummer + ": Die Buchung konnte nicht ausgef¨¹hrt werden.");
			Transaktion = false;
		}
		return Transaktion;
	}

	public void verzinsen() {
		double zinsen = kontostand*zinssatz;
		einzahlen(zinsen);
	}
	public void jahresabschluss(Sparkonto[] konten) {
		for(int i=0;i<konten.length;i++) {
			konten[i].verzinsen();
		}
		
	}
	public static void main (String args[]) {
		
	}
}
