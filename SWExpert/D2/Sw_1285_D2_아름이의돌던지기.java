import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sw_1285_D2_아름이의돌던지기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bf.readLine());

		for (int tc = 1; tc <= testCase; tc++) {
			int min = 100000;
			int cnt = 0;
			int N = Integer.parseInt(bf.readLine());
			int[] stone = new int[N];
			String[] tmp = bf.readLine().split(" ");
			for (int i = 0; i < N; i++) {
				stone[i] = Integer.parseInt(tmp[i]);
				if ((int) Math.abs(stone[i]) < min) {
					min = (int) Math.abs(stone[i]);
					cnt = 1;
				} else if ((int) Math.abs(stone[i]) == min)
					cnt++;
			}
			System.out.println("#" + tc + " " + min + " " + cnt);
		}

	}
}
