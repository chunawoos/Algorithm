import java.util.Scanner;

public class Ladder1 {

	private static int[][] data = new int[100][100];

	public static void main(String[] args) {
		int testCase;
		int[] line;
		int lineCnt;
		int correct;
		Scanner sc = new Scanner(System.in);

		do {
			lineCnt = 0;
			correct = 0;
			boolean isFind = false;
			testCase = sc.nextInt();
			for (int i = 0; i < 100; i++)
				for (int j = 0; j < 100; j++) {
					data[i][j] = sc.nextInt();
					if (i == 0) {
						if (data[i][j] == 1)
							lineCnt++;
					}
				}
			line = new int[lineCnt];
			lineCnt = 0;
			for (int i = 0; i < 100; i++) {
				if (data[0][i] == 1) {
					line[lineCnt] = i;
					lineCnt++;
				}
			}

			for (int ln : line) {
				if (isFind)
					break;
				int tmp = ln;
				for (int i = 0; i < 100; i++) {
					if ((tmp - 1) >= 0 && data[i][tmp - 1] == 1) {
						while ((tmp - 1) >= 0 && data[i][tmp - 1] != 0) {
							tmp -= 1;
						}
					} else if ((tmp + 1) < 100 && data[i][tmp + 1] == 1) {
						while ((tmp + 1) < 100 && data[i][tmp + 1] != 0) {
							tmp += 1;
						}
					}
					if (i == 99 && data[i][tmp] == 2) {
						correct = ln;
						isFind = true;
					} else if (i == 99 && data[i][tmp] == 1)
						continue;
				}
			}
			System.out.println("#" + testCase + " " + correct);
		} while (testCase != 10);
		sc.close();
	}
}