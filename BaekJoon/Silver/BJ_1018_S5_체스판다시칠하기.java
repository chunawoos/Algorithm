import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_1018_S5_체스판다시칠하기 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int row = Integer.parseInt(st.nextToken());
		int col = Integer.parseInt(st.nextToken());
		char[][] chess = new char[row][];
		char[][] copy = new char[row][];
		for (int i = 0; i < row; i++) {
			chess[i] = bf.readLine().toCharArray();
			copy[i] = Arrays.copyOf(chess[i], col);
		}
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < row - 7; i++) {
			for (int j = 0; j < col - 7; j++) {
				int cnt = 0;
				for (int k = i; k < i + 8; k++) {
					for (int l = j; l < j + 8; l++) {
						if ((k + l) % 2 == 0 && copy[k][l] == 'W') {
							cnt++;
						} else if ((k + l) % 2 != 0 && copy[k][l] == 'B') {
							cnt++;
						}
					}
				}
				min = min > cnt ? cnt : min;
				cnt = 0;

				for (int k = i; k < i + 8; k++) {
					for (int l = j; l < j + 8; l++) {
						if ((k + l) % 2 == 0 && copy[k][l] == 'B') {
							cnt++;
						} else if ((k + l) % 2 != 0 && copy[k][l] == 'W') {
							cnt++;
						}
					}
				}
				min = min > cnt ? cnt : min;
			}
		}
		System.out.println(min);
	}
}
