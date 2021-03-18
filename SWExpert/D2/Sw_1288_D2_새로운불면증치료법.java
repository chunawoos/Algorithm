import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sw_1288_D2_새로운불면증치료법 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bf.readLine());

		for (int tc = 1; tc <= testCase; tc++) {
			int N = Integer.parseInt(bf.readLine());
			int[] num = new int[10];
			boolean isFull = false;
			int tmp = N;
			int cnt = 1;
			while (!isFull) {
				for (int i = tmp; tmp > 0; tmp /= 10) {
					num[tmp % 10] = 1;
				}
				for (int i = 0; i < 10; i++) {
					if (num[i] == 0)
						break;
					if (i == 9 && num[i] == 1) {
						isFull = true;
					}
				}
				if (isFull)
					break;
				tmp = N * (++cnt);
			}
			System.out.println("#" + tc + " " + N * cnt);
		}
	}
}
