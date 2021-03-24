import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_15650_S3_N과M2 {
	private static int N, M;
	private static boolean[] visit;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		visit = new boolean[N + 1];
		dfs(1, 0);
	}

	private static void dfs(int start, int cnt) {

		if (cnt == M) {
			for (int i = 1; i <= N; i++) {
				if (visit[i])
					System.out.print(i + " ");
			}
			System.out.println();
			return;
		}

		for (int i = start; i <= N; i++) {
			visit[i] = true;
			dfs(i + 1, cnt + 1);
			visit[i] = false;
		}
	}
}
