import gdp.uebung11.bank.exceptions.*;

public class Konto{
	int kontonummer;
	double kontostand;
	public Konto(int kontonummer) {
		this.kontonummer=kontonummer;
		this.kontostand=0;
	}
	public void einzahlen(double betrag) throws NegativerBetragException {
		if (betrag > 0) {
			kontostand = kontostand + betrag;
		}
		if (betrag < 0) {
			throw new NegativerBetragException("Einzahlung fehlgeschlagen, der Betrag ist negativ.");
		}
	}
	
	public void auszahlen(double betrag) throws NegativerBetragException, KontoNichtGedecktException {
		if (betrag > 0 && kontostand >= betrag) {
			kontostand = kontostand - betrag;
		} if(betrag<0) {
			throw new NegativerBetragException("Auszahlung fehlgeschlagen, der Betrag ist negativ.");
		} 
		if(kontostand<betrag) {
			throw new KontoNichtGedecktException("Auszahlung fehlgeschlagen, das Konto ist nicht ausreichend gedeckt.");
		}
		
		
	}
	public void druckeKontoauszug() {
		System.out.println("Kontonummer: "+this.kontonummer);
		System.out.println("Kontostand: "+this.kontostand);
	}

}
