import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_1260_S2_DFS와BFS {
	private static int N;
	private static int M;
	private static int[][] matrix;
	private static boolean[] visit;
	private static Queue<Integer> q;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());

		matrix = new int[N + 1][N + 1];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(bf.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			matrix[from][to] = 1;
			matrix[to][from] = 1;
		}
		visit = new boolean[N + 1];
		visit[start] = true;
		q = new LinkedList<>();
		q.offer(start);
		dfs(start);
		visit = new boolean[N + 1];
		visit[start] = true;
		q.offer(start);
		List<Integer> bfs = new ArrayList<Integer>();
		while (!q.isEmpty()) {
			int cur = q.poll();

			for (int i = 1; i <= N; i++) {
				if (matrix[cur][i] == 1 && !visit[i]) {
					visit[i] = true;
					q.offer(i);
				}
			}
			bfs.add(cur);
		}
		for (int i = 0; i < bfs.size(); i++) {
			System.out.print(bfs.get(i) + " ");
		}
		System.out.println();
	}

	private static void dfs(int start) {

		if (q.size() == N) {
			while (!q.isEmpty()) {
				System.out.print(q.poll() + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 1; i <= N; i++) {
			if (matrix[start][i] == 1 && !visit[i]) {
				visit[i] = true;
				q.offer(i);
				dfs(i);
			}
		}
	}

}
