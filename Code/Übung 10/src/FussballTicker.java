
public class FussballTicker implements LiveTicker {
	private int heimPunkte;
	private int gastPunkte;
	
	public void aktualisiere(int heimPunkte, int gastPunkte) {
		this.heimPunkte=heimPunkte;
		this.gastPunkte=gastPunkte;
	}
	
	public void stelleDar() {
		System.out.println("Spielstand: "+this.heimPunkte+" : "+this.gastPunkte);
	}
}
