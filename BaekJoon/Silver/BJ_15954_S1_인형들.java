import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_15954_S1_인형들 {

	private static int N, R;
	private static int[] doll, sum;
	private static double min;

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		N = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		doll = new int[N];
		sum = new int[N - R + 1];
		min = Double.MAX_VALUE;
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < N; i++) {
			doll[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < R; i++)
			sum[0] += doll[i];
		deviation(R, 0);
		for (int i = 1; i < N - R + 1; i++) {
			sum[i] = sum[i - 1] - doll[i - 1] + doll[i + R - 1];
			deviation(R, i);
		}
		for (int i = R + 1; i < N; i++) {
			for (int j = 0; j < N - i + 1; j++) {
				sum[j] += doll[j + i - 1];
				deviation(i, j);
			}
		}
		System.out.printf("%.11f\n", min);
	}

	private static void deviation(int cnt, int start) {

		double avg = (double) sum[start] / cnt;
		double result = 0;
		for (int i = start; i < start + cnt; i++) {
			result += Math.pow(Math.abs(doll[i] - avg), 2);
		}
		result /= cnt;
		if (min > Math.sqrt(result))
			min = Math.sqrt(result);

	}
}
