import java.util.Scanner;
public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int note = 0;
		int i=0;
		Scanner Scanner = new Scanner(System.in);
		while (i<10) {
			System.out.println("Bitte geben Sie Note ein:");
		if (Scanner.hasNextInt()) {
			note = Scanner.nextInt();	
		}
		else {
			System.out.println("Eingabefehler");
		}
		
		switch (note) {
		case 1:
			System.out.println("Sehr gut");
			break;
		case 2:
			System.out.println("Gut");
			break;
		case 3:
			System.out.println("Befriedigend");
			break;
		case 4:
			System.out.println("Ausreichend");
			break;
		case 5:
			System.out.println("Mangelhaft");
			break;
		case 6:
			System.out.println("Unzureichend");
			break;
		default:
			System.out.println("Fehler: Die Eingabe ist keine Note£¡");
			break;
			
		}
		i++;
	}
	}
}
