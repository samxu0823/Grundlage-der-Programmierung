
public class Wetterstation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temperaturen = { 12, 14, 9, 12, 15, 16, 15, 15, 11, 8, 13, 13, 15, 12 };
		berechneDurchschnittstemperatur(temperaturen);
		berechneExtremtemperatur(temperaturen);
		berechneUmschwung(temperaturen);
	}

	public static double berechneDurchschnittstemperatur(int[] temps) {
		double sum = 0;
//		If data type is int, it will cause information loss by return value.
		for (int i = 0; i < temps.length; i++) {
			sum = sum + temps[i];
//			Implizite Casting(double + int--> double + double)
		}
		double average = sum / temps.length;
		System.out.println(average);
		return average;
	}

	public static int berechneExtremtemperatur(int[] temps) {
		int i = 0;
		int max = temps[i];
		while (i < temps.length) {
			if (temps[i] > max) {
				max = temps[i];
			}
			i++;
		}
		System.out.println(max);
		return max;
	}

	public static int berechneUmschwung(int[] temps) {
		int i = 0;
		int max = temps[i];
		int min = temps[i];
		do {
			if (temps[i] > max) {
				max = temps[i];
			}
			i++;
		} while (i < temps.length);
		i = 0;
		do {
			if (temps[i] < min) {
				min = temps[i];
			}
			i++;
		} while (i < temps.length);
		int Umschwung = max - min;
		System.out.println(Umschwung);
		return Umschwung;
	}

}
