import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_14501_S4_퇴사 {

	private static int N, max;
	private static int[][] work;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(bf.readLine());
		work = new int[N + 1][2];
		StringTokenizer st = null;
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(bf.readLine());
			work[i][0] = Integer.parseInt(st.nextToken());
			work[i][1] = Integer.parseInt(st.nextToken());
		}
		dfs(1, 0);
		System.out.println(max);
	}

	private static void dfs(int day, int profit) {
		if (day == N + 1) {
			max = max > profit ? max : profit;
			return;
		}

		if (day + work[day][0] > N + 1) {
			dfs(day + 1, profit);
		} else {
			dfs(day + work[day][0], profit + work[day][1]);
			dfs(day + 1, profit);
		}
	}
}
