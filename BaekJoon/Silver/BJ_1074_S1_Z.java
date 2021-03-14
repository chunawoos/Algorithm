import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1074_S1_Z {
	private static int N, x, y, count;

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());

		count = 0;
		search(0, 0, (int) Math.pow(2, N), 0);
		System.out.println(count);
	}

	private static void search(int fx, int fy, int dim, int cnt) {

		if (dim == 2) {
			if (fx == x && fy == y) {
				count = cnt;
			} else if (fx == x && (fy + 1) == y) {
				count = cnt + 1;
			} else if ((fx + 1) == x && fy == y)
				count = cnt + 2;
			else
				count = cnt + 3;

			return;
		}
		int half = dim / 2;
		if (fx + half > x && fy + half > y)
			search(fx, fy, half, cnt);
		else if (fx + half > x && fy + half <= y)
			search(fx, fy + half, half, cnt + half * half);
		else if (fx + half <= x && fy + half > y)
			search(fx + half, fy, half, cnt + 2 * half * half);
		else if (fx + half <= x && fy + half <= y)
			search(fx + half, fy + half, half, cnt + 3 * half * half);
	}
}
