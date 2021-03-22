import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_15649_S3_N과M1 {
	private static int N, M;
	private static boolean[] visit;
	private static int[] num;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		visit = new boolean[N + 1];
		num = new int[M];
		dfs(0);
	}

	private static void dfs(int cnt) {
		if (cnt == M) {
			for (int i = 0; i < M; i++) {
				System.out.print(num[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 1; i <= N; i++) {
			if (visit[i])
				continue;
			visit[i] = true;
			num[cnt] = i;
			dfs(cnt + 1);
			visit[i] = false;
		}
	}
}
