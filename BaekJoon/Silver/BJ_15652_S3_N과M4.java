import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class BJ_15652_S3_N과M4 {
	
	private static int N, M;
	private static int [] seq;
	private static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		sb = new StringBuilder();
		seq = new int[M];
		combination(1, 0);
		System.out.println(sb);
	}

	private static void combination(int start, int count) {
		
		if(count == M) {
			for (int i = 0; i < M; i++) {
				sb.append(seq[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i = start; i <= N; i++) {
			seq[count] = i;
			combination(i, count+1);
		}
	}
}
