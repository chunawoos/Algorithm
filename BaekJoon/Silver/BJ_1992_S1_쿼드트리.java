import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_1992_S1_쿼드트리 {

	private static int[][] map;
	private static int N;

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(bf.readLine());

		map = new int[N][N];

		for (int i = 0; i < N; i++) {
			String[] tmp = bf.readLine().split("");
			for (int j = 0; j < N; j++)
				map[i][j] = Integer.parseInt(tmp[j]);
		}
		quadDivision(0, 0, N);
	}

	private static void quadDivision(int x, int y, int dim) {
		int cnt = 0;
		;
		for (int i = x; i < x + dim; i++) {
			for (int j = y; j < y + dim; j++) {
				cnt += map[i][j];
			}
		}
		if (cnt == dim * dim) {
			System.out.print(1);
		} else if (cnt == 0) {
			System.out.print(0);
		} else {
			if (dim / 2 == 0)
				return;
			System.out.print("(");
			quadDivision(x, y, dim / 2);
			quadDivision(x, y + dim / 2, dim / 2);
			quadDivision(x + dim / 2, y, dim / 2);
			quadDivision(x + dim / 2, y + dim / 2, dim / 2);
			System.out.print(")");
		}
	}
}
