import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10819_S2_차이를최대로 {
	private static int N, max;
	private static int[] numbers, choose;
	private static boolean[] chosen;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(bf.readLine());
		numbers = new int[N];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		choose = new int[N];
		chosen = new boolean[N];
		dfs(0);
		System.out.println(max);
	}

	private static void dfs(int cnt) {

		if (cnt == N) {
			int sum = 0;
			for (int i = 0; i < N - 1; i++) {
				sum += Math.abs(choose[i] - choose[i + 1]);
			}
			max = max > sum ? max : sum;
			return;
		}

		for (int i = 0; i < N; i++) {
			if (chosen[i])
				continue;
			choose[cnt] = numbers[i];
			chosen[i] = true;
			dfs(cnt + 1);
			chosen[i] = false;
		}
	}
}
