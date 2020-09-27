package gdp.uebung11.bank.exceptions;

public class KontoNichtGedecktException extends BankException {
	public KontoNichtGedecktException(String wert) {
		super(wert);
	}
}
