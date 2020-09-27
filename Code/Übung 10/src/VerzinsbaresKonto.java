
public abstract class VerzinsbaresKonto extends Konto {
//	Zinsatz soll nicht als statisch definiert werden!
	double Zinssatz;

	public VerzinsbaresKonto(int kontonummer) {
		super(kontonummer);
	}

	public abstract void verzinsen();
}
