
public class KontoVerwaltung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Erstellung der Konto
		Konto K1 = new Konto(111);
		Konto K2 = new Konto(222);
		Konto K3 = new Konto(333);
		Konto K4 = new Konto(444);
		Konto K5 = new Konto(555);
//		Transaktion der Konto
		K1.einzahlen(500.00);
		K2.einzahlen(-5.00);
		K3.einzahlen(46.50);
		K4.auszahlen(5.60);
		K1.auszahlen(42.00);
		K5.einzahlen(4.33);
//		Ausgabe des Kontozustands
		K3.kontozustand();
	}

}
