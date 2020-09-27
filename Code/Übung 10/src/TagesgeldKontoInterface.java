
public class TagesgeldKontoInterface extends Konto implements Verzinsbar {
	double Zinssatz;
	public TagesgeldKontoInterface(int kontonummer) {
		super(kontonummer);
		Zinssatz=0.0001;
	}
	public void verzinsen() {
		 double zinsen=kontostand*Zinssatz;
		 einzahlen(zinsen);
	}
}
