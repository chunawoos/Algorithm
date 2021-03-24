import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1932_S1_정수삼각형 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[][] tri = new int[N + 1][N + 1];
		StringTokenizer st = null;
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(bf.readLine());
			for (int j = 1; j <= i; j++) {
				tri[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int[][] D = new int[N + 1][N + 1];
		D[1][1] = tri[1][1];
		for (int i = 2; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				D[i][j] = Math.max(D[i - 1][j - 1], D[i - 1][j]) + tri[i][j];
			}
		}
		int max = 0;
		for (int i = 1; i <= N; i++) {
			if (max < D[N][i])
				max = D[N][i];
		}
		System.out.println(max);
	}
}
