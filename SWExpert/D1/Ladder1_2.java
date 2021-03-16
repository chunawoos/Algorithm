import java.util.Scanner;

public class Ladder1_2 {

	private static int[][] data = new int[100][100];

	public static void main(String[] args) {
		int testCase;
		int correct;
		Scanner sc = new Scanner(System.in);

		do {
			int tmp = 0;
			correct = 0;
			boolean isFind = false;
			testCase = sc.nextInt();
			for (int i = 0; i < 100; i++)
				for (int j = 0; j < 100; j++) {
					data[i][j] = sc.nextInt();
					if (data[i][j] == 2)
						tmp = j;
				}
			for (int i = 99; i >= 0; i--) {

			}

			System.out.println("#" + testCase + " " + correct);
		} while (testCase != 10);
		sc.close();
	}
}