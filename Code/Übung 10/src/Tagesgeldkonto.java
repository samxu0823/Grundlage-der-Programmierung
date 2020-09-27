
public class Tagesgeldkonto extends VerzinsbaresKonto implements Verzinsbar{
	public Tagesgeldkonto(int kontonummer){
		super(kontonummer);
		Zinssatz=0.001;
	}
	public void verzinsen() {
		 double zinsen=kontostand*Zinssatz;
		 einzahlen(zinsen);
		// TODO Auto-generated method stub
	}
}
