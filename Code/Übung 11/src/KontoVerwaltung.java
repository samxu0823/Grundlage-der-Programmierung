import gdp.uebung11.bank.exceptions.KontoNichtGedecktException;
import gdp.uebung11.bank.exceptions.NegativerBetragException;

public class KontoVerwaltung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Konto K1 = new Konto(1042);
		try {
			K1.einzahlen(-10);
			K1.druckeKontoauszug();
		}
		catch(NegativerBetragException e) {
			System.out.println(e.getMessage());
		}
		try {
			K1.einzahlen(500);
			K1.druckeKontoauszug();
		}
		catch(NegativerBetragException e) {
			System.out.println(e.getMessage());
		}
		try {
			K1.auszahlen(1.99);
			K1.druckeKontoauszug();
		}
		catch(KontoNichtGedecktException e) {
			System.out.println(e.getMessage());
		}
		catch(NegativerBetragException f) {
			System.out.println(f.getMessage());
		}
		try {
			K1.auszahlen(500);
			K1.druckeKontoauszug();
		} 
		catch(KontoNichtGedecktException e) {
			System.out.println(e.getMessage());
		}
		catch(NegativerBetragException f) {
			System.out.println(f.getMessage());
		}
	}

}
