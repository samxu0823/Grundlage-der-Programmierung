
public class Bank {
	public static void main(String[] args) {
		Konto[] Konto = new Konto[3];
//	giro1
		Konto[0] = new Girokonto(1001, 300);
		Konto[0].einzahlen(1000);
		übergeben(Konto[0]);
		Konto[0].auszahlen(1200);
		übergeben(Konto[0]);
//	tag1
		Tagesgeldkonto tag1 = new Tagesgeldkonto(1002);
		Konto[1] = tag1;
		Konto[1].einzahlen(2000);
		übergeben(Konto[1]);
//	spar1
		Sparkonto spar1 = new Sparkonto(1003);
		Konto[2] = spar1;
		Konto[2].einzahlen(5000);
		übergeben(Konto[2]);
		switch (2) {
		// Abstrakte Klsse
		case 1:
			if (Konto[1] instanceof VerzinsbaresKonto && Konto[2] instanceof VerzinsbaresKonto) {
				VerzinsbaresKonto V1 = (VerzinsbaresKonto) Konto[1];
				VerzinsbaresKonto V2 = (VerzinsbaresKonto) Konto[2];
				VerzinsbaresKonto[] K1 = { V1, V2 };
				verzinseKonten(K1);
				übergeben(V1);
				übergeben(V2);
			}
			break;
//				Interface
		case 2:
			Verzinsbar V3 = (Verzinsbar) tag1;
			Verzinsbar V4 = (Verzinsbar) spar1;
			Verzinsbar[] Ver = { V3, V4 };
			verzinseKontenIn(Ver);
			übergeben((Konto) V3);
			übergeben((Konto) V4);
			break;
		}

	}

	public static void übergeben(Konto Konto) {
		System.out.println(Konto.kontostand);
	}

	public static void verzinseKonten(VerzinsbaresKonto[] Konto) {
		for (int i = 0; i < Konto.length; i++) {
			Konto[i].verzinsen();
		}
	}

	public static void verzinseKontenIn(Verzinsbar[] Ver) {
		Tagesgeldkonto T1 = (Tagesgeldkonto) Ver[0];
		T1.verzinsen();
		Sparkonto S1 = (Sparkonto) Ver[1];
		S1.verzinsen();
	}
}
