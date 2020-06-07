
public class Matrixuebung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 2, 3 }, { 21, 42 }, { 0, 1 } };
		int x = 1;
		switch (x) {
		case 1:
			System.out.println("Erste Matrix:");
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					if (j == matrix[i].length - 1) {
						System.out.println(matrix[i][j]);
					} else {
						System.out.print(matrix[i][j] + " ");
					}
				}
			}
			break;
		case 2:
			int sum = matrix[0][0];
			for (int i = 1; i < matrix[0].length; i++) {
				sum = sum + matrix[0][i];
			}
			sum = sum + matrix[1][0];
			matrix[1][1] = sum;
			matrix[1][0] = matrix[1][0] - 5;
			System.out.println("Zweite Matrix:");
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					if (j == matrix[i].length - 1) {
						System.out.println(matrix[i][j]);
					} else {
						System.out.print(matrix[i][j] + " ");
					}
				}
			}
			break;
		}
	}
}
