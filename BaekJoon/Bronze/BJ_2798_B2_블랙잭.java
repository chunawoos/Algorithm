import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2798_B2_블랙잭 {
	private static int N, M, max;
	private static int[] card;
	private static boolean[] visit;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		card = new int[N];
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < N; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		max = 0;
		visit = new boolean[N];
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					int sum = card[i] + card[j] + card[k];
					if (sum <= M) {
						max = max > sum ? max : sum;
					}
				}
			}
		}
		System.out.println(max);
	}
}
