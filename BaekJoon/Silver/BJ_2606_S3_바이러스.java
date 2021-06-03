import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_2606_S3_바이러스 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int M = Integer.parseInt(bf.readLine());
		boolean [][] matrix = new boolean[N+1][N+1];
		
		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			matrix[from][to] = true;
			matrix[to][from] = true;
		}
		boolean [] check = new boolean[N+1];
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(1);
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			
			for (int i = 2; i <= N; i++) {
				if(matrix[cur][i] && !check[i]) {
					check[i] = true;
					q.offer(i);
				}
			}
		}
		int res = 0;
		
		for (int i = 2; i <= N; i++) {
			if(check[i]) res++;
		}
		System.out.println(res);
	}
}
