// Aufgabenteil a)
public class Sparkonto extends Konto{
	static double zinssatz;

	public Sparkonto(int kontonummer) {
		super(kontonummer);
	}
	
	public void verzinsen() {
		double zinsen = kontostand * zinssatz;
		einzahlen(zinsen);
	}

	public static void jahresabschluss(Sparkonto[] konten) {
		for (int i = 0; i < konten.length; i++) {
			konten[i].verzinsen();
		}
	}
}
