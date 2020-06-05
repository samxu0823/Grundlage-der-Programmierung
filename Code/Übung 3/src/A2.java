
public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4;
		switch (x) {
		case 1:
			for (int i = 1; i <= 1000; i++) {
				System.out.println(i);
			}
			break;
		case 2:
			for (int i = 1, j = 1; i <= 1000; i++) {
				j = i * i;
				System.out.println(j);
			}
			break;
		case 3:
			for (int i = 1, j = 1; i <= 1000; i++) {
				j = i * i;
				if (j % 5 == 0) {
					System.out.println(j);
				}
			}
			break;
		case 4:
//			int a[];
//			a = new int [5];
			int a[] = new int[5];
			int b[] = new int[5];
			for (int i = 0; i < 5; i++) {
				a[i] = i;
				b[i] = a[i] * a[i];
			}
			for (int i = 0; i <= 5; i++) {
				if (i == 5) {
					System.out.print("\n");
				} else {
					System.out.print(a[i] + " ");
				}

			}
			for (int i = 0; i <= 5; i++) {
				if (i == 5) {
					System.out.print("\n");
				} else {
					System.out.print(b[i] + " ");
				}

			}

			break;
		}
	}
}
