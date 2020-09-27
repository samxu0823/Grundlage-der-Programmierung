
public class Sparkonto extends VerzinsbaresKonto implements Verzinsbar{
	public Sparkonto(int kontonummer) {
		super(kontonummer);
		Zinssatz=0.004;
	}
	public void verzinsen() {
		 double zinsen=kontostand*Zinssatz;
		 einzahlen(zinsen);
	}
}
