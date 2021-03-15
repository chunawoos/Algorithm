import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1149_S1_RGB거리 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[][] price = new int[N + 1][3];
		StringTokenizer st = null;
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(bf.readLine());
			price[i][0] = Integer.parseInt(st.nextToken());
			price[i][1] = Integer.parseInt(st.nextToken());
			price[i][2] = Integer.parseInt(st.nextToken());
		}
		int[][] D = new int[N + 1][3];
		D[1][0] = price[1][0];
		D[1][1] = price[1][1];
		D[1][2] = price[1][2];
		for (int i = 2; i <= N; i++) {
			D[i][0] = Math.min(D[i - 1][1], D[i - 1][2]) + price[i][0];
			D[i][1] = Math.min(D[i - 1][0], D[i - 1][2]) + price[i][1];
			D[i][2] = Math.min(D[i - 1][0], D[i - 1][1]) + price[i][2];
		}
		int res = D[N][0] > D[N][1] ? D[N][1] > D[N][2] ? D[N][2] : D[N][1] : D[N][0] > D[N][2] ? D[N][2] : D[N][0];
		System.out.println(res);
	}
}
