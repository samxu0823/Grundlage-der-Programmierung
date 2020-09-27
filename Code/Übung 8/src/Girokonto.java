
public class Girokonto extends Konto{
	double dispoLimit;
	public Girokonto(int kontonummer,double dispoLimit) {
		super(kontonummer);
		this.dispoLimit=dispoLimit;
	}
	public boolean auszahlen(double betrag) {
		if (betrag > 0 && kontostand + dispoLimit>= betrag) {
			kontostand = kontostand - betrag;
			return true;
		} else {
			return false;
		}
	}

}
