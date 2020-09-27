
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sparkonto.zinssatz = 0.006;
		Konto[] K = new Konto[3];
		K[0] = new Sparkonto(1);
		K[1] = new Girokonto(1, 1500);
		K[2] = new Girokonto(2, 100);
		Sparkonto a = new Sparkonto(111);
//		Type checking and explicit casting
		for (int i = 0; i < K.length; i++) {
			if (K[i] instanceof Sparkonto) {
				a= (Sparkonto) K[i];
			}
		}
//		1. Schritt
		K[1].einzahlen(1000);
		K[1].druckeKontoauszug();
//		2. Schritt
		K[1].auszahlen(1500);
		K[1].druckeKontoauszug();
//		3. Schritt
		K[2].einzahlen(200);
		K[2].druckeKontoauszug();
//		4. Schritt
		K[2].auszahlen(700);
		K[2].druckeKontoauszug();
//		5. Schritt
		a.einzahlen(5000);
		a.verzinsen();
		a.druckeKontoauszug();
	}

}
