
public class KontoVerwaltung {
	/**
	 * Alternative Method: Set Zinssatz
	 * 
	 * @param konten  Sparkonto
	 * @param zinsatz Zinsatz
	 */
	public static void setZinsatz(Sparkonto[] konten, double zinsatz) {
		for (int i = 0; i < konten.length; i++) {
			konten[i].zinssatz = zinsatz;
		}
	}

	/**
	 * Output Kontozustand
	 * 
	 * @param konten Sparkonto
	 */
	public static void zustandAusgabe(Sparkonto[] konten) {
		for (int i = 0; i < konten.length; i++) {
			konten[i].verzinsen();
			System.out.println(konten[i].kontostand);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sparkonto S1 = new Sparkonto(01);
		Sparkonto S2 = new Sparkonto(02);
		Sparkonto S3 = new Sparkonto(03);
		Sparkonto S4 = new Sparkonto(04);
		Sparkonto S5 = new Sparkonto(05);
		Sparkonto[] Konto = { S1, S2, S3, S4, S5 };
		S1.einzahlen(500.00);
		S2.einzahlen(-5.00);
		S3.einzahlen(46.50);
		S4.auszahlen(5.60);
		S1.auszahlen(42.00);
		S5.einzahlen(4.33);
//		Define 1. Zinssatz
		Sparkonto.zinssatz = 0.04;
//		Alternative:setZinsatz(Konto, 0.04);
		System.out.println("1.Verzisung");
		zustandAusgabe(Konto);
		System.out.print("\n");
//		Define 2. Zinssatz
		Sparkonto.zinssatz = 0.1;
//		Alternative:setZinsatz(Konto, 0.1);
		System.out.println("2.Verzisung");
		zustandAusgabe(Konto);
	}
}
