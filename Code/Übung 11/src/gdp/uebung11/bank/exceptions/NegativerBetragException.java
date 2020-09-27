package gdp.uebung11.bank.exceptions;

public class NegativerBetragException extends BankException {
	public NegativerBetragException(String wert) {
		super(wert);
	}
}
