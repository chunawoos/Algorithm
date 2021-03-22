import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_16958_S2_텔레포트 {
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
		int M = Integer.parseInt(bf.readLine().trim());

		int to = 0, from = 0, dis = 0;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(bf.readLine());
			to = Integer.parseInt(st.nextToken());
			from = Integer.parseInt(st.nextToken());
			dis = Math.abs(city[to][1] - city[from][1]) + Math.abs(city[to][2] - city[from][2]);
			if (city[to][0] == 1 && city[from][0] == 1 && dis > T) {
				System.out.println(T);
			} else if ((city[to][0] == 0 && city[from][0] == 0) || (city[to][0] == 1 && city[from][0] == 1 && dis <= T))
				System.out.println(dis);
			else if (city[to][0] == 1 && city[from][0] == 0) {
				for (int j = 0; j <= N; j++) {
					if (j != from && city[j][0] == 1) {
						dis = Math.min(dis,
								T + Math.abs(city[j][1] - city[from][1]) + Math.abs(city[j][2] - city[from][2]));
					}
				}
				System.out.println(dis);
			} else {
				for (int j = 0; j <= N; j++) {
					if (j != to && city[j][0] == 1) {
						dis = Math.min(dis,
								T + Math.abs(city[j][1] - city[to][1]) + Math.abs(city[j][2] - city[to][2]));
					}
				}
				System.out.println(dis);
			}
		}
	}
}
