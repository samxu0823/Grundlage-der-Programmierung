
public class SparKontoInterface extends Konto implements Verzinsbar {
	double Zinssatz;
	public SparKontoInterface(int kontonummer) {
		super(kontonummer);
		Zinssatz=0.004;
	}
	@Override
	public void verzinsen() {
		 double zinsen=kontostand*Zinssatz;
		 einzahlen(zinsen);
		// TODO Auto-generated method stub

	}

}
