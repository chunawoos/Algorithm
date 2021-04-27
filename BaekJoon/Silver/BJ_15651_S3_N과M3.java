import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_15651_S3_N과M3 {
	private static int N, M;
	private static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		sb = new StringBuilder();
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		dfs(0, new int[M]);
		System.out.println(sb.toString());
	}

	private static void dfs(int cnt, int [] num) {
		
		if(cnt == M) {
			for (int i = 0; i < M; i++) {
				sb.append(num[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i = 1; i <= N; i++) {
			num[cnt] = i;
			dfs(cnt+1, num);
		}
	}
}
