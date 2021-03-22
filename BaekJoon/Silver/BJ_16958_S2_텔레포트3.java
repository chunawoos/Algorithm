import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BJ_16958_S2_텔레포트3 {

	static class Vertex implements Comparable<Vertex> {
		int no, td;

		public Vertex(int no, int td) {
			this.no = no;
			this.td = td;
		}

		@Override
		public int compareTo(Vertex o) {
			return this.td - o.td;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		int[][] city = new int[N + 1][3];
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(bf.readLine());
			city[i][0] = Integer.parseInt(st.nextToken());
			city[i][1] = Integer.parseInt(st.nextToken());
			city[i][2] = Integer.parseInt(st.nextToken());
		}
		int[][] matrix = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (i == j)
					continue;
				matrix[i][j] = (city[i][0] == 1 && city[j][0] == 1)
						? Math.min(T, Math.abs(city[i][1] - city[j][1]) + Math.abs(city[i][2] - city[j][2]))
						: Math.abs(city[i][1] - city[j][1]) + Math.abs(city[i][2] - city[j][2]);
			}
		}
		int M = Integer.parseInt(bf.readLine().trim());
		int[][] distance = new int[N + 1][N + 1];
		PriorityQueue<Vertex> pq = null;
		boolean[] v = null;
		for (int i = 1; i <= N; i++) {
			pq = new PriorityQueue<>();
			Arrays.fill(distance[i], Integer.MAX_VALUE);
			distance[i][i] = 0;
			pq.offer(new Vertex(i, distance[i][i]));
			v = new boolean[N + 1];
			Vertex cur = null;
			int cnt = 0;
			while (!pq.isEmpty()) {
				cur = pq.poll();

				if (cnt == N)
					break;
				if (v[cur.no])
					continue;
				v[cur.no] = true;
				cnt++;
				for (int j = 1; j <= N; j++) {
					if (!v[j] && distance[i][j] > cur.td + matrix[cur.no][j]) {
						distance[i][j] = cur.td + matrix[cur.no][j];
						pq.offer(new Vertex(j, distance[i][j]));
					}
				}
			}
		}
		int to = 0, from = 0;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(bf.readLine());
			to = Integer.parseInt(st.nextToken());
			from = Integer.parseInt(st.nextToken());
			System.out.println(distance[to][from]);
		}
	}
}
