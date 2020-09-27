public class Kontoverwaltung {

	// Aufgabenteil e)
	public static void main(String[] args) {
		Sparkonto erstesKonto = new Sparkonto(111);
		Sparkonto zweitesKonto = new Sparkonto(222);
		Sparkonto drittesKonto = new Sparkonto(333);
		Sparkonto viertesKonto = new Sparkonto(444);
		Sparkonto fuenftesKonto = new Sparkonto(555);
		
		Sparkonto[] konten = {erstesKonto, zweitesKonto, drittesKonto, viertesKonto, fuenftesKonto};

		konten[0].einzahlen(500.00);
		konten[1].einzahlen(-5.00);
		konten[2].einzahlen(46.50);
		konten[3].auszahlen(5.60);
		konten[0].auszahlen(42.00);
		konten[4].einzahlen(4.33);
		
		Kontoverwaltung.kontenAusgeben(konten);

		Sparkonto.zinssatz = 0.04;
		Sparkonto.jahresabschluss(konten);
		System.out.println("--- Jahresabschluss durchgef¨¹hrt ---");
		Kontoverwaltung.kontenAusgeben(konten);

		Sparkonto.zinssatz = 0.1;
		Sparkonto.jahresabschluss(konten);
		System.out.println("--- Jahresabschluss durchgef¨¹hrt ---");
		Kontoverwaltung.kontenAusgeben(konten);
	}

	public static void kontenAusgeben(Sparkonto[] konten) {
		for (int i = 0; i < konten.length; i++) {
			System.out.println("Kontostand f¨¹r Kontonr. " + 
			konten[i].kontonummer + ": " + konten[i].kontostand);
		}
	}
}
