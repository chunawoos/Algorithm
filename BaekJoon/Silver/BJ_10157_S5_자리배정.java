import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10157_S5_자리배정 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int[][] stage = new int[r + 1][c + 1];
		int num = 1;
		int curr = 1, curc = 1;
		while (num <= r * c) {
			while (true) {
				if (curc > c || stage[curr][curc] != 0) {
					curc--;
					curr++;
					break;
				}
				stage[curr][curc++] = num++;
			}
			while (true) {
				if (curr > r || stage[curr][curc] != 0) {
					curr--;
					curc--;
					break;
				}
				stage[curr++][curc] = num++;
			}
			while (true) {
				if (curc <= 0 || stage[curr][curc] != 0) {
					curc++;
					curr--;
					break;
				}
				stage[curr][curc--] = num++;
			}
			while (true) {
				if (curr <= 0 || stage[curr][curc] != 0) {
					curr++;
					curc++;
					break;
				}
				stage[curr--][curc] = num++;
			}

		}
		int N = Integer.parseInt(bf.readLine());
		if (N > r * c) {
			System.out.println(0);
		} else {
			for (int i = 1; i <= r; i++) {
				for (int j = 1; j <= c; j++) {
					if (stage[i][j] == N) {
						System.out.println(i + " " + j);
						System.exit(0);
					}
				}
			}
		}
	}
}
