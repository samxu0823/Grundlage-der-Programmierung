package einf¨¹hrung;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		// Get the Data from Keyboard Input
		System.out.println("Eingabe x");
		int x = 0;
		int y = 0;
		if (scann.hasNextInt()) {
			x = scann.nextInt();
		} else {
			System.out.println("Eingabefehler!");
		}
		System.out.println("Eingabe y");
		if (scann.hasNextInt()) {
			y = scann.nextInt();
		} else {
			System.out.println("Eingabefehler!");
		}
		while (x!=y) {
		if (x>y) {
			x=x-y;
		}
		else {
			y=y-x;
		}
		}
		System.out.println("x="+x);
		System.out.println("y="+y);
		// TODO Auto-generated method stub

	}

}
