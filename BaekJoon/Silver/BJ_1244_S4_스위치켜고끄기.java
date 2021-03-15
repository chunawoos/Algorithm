import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1244_S4_스위치켜고끄기 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[] bulb = new int[N + 1];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for (int i = 1; i <= N; i++) {
			bulb[i] = Integer.parseInt(st.nextToken());
		}
		int students = Integer.parseInt(bf.readLine());
		for (int i = 0; i < students; i++) {
			st = new StringTokenizer(bf.readLine());
			int gender = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (gender == 1) {
				int cnt = N / num;
				for (int j = 1; j <= cnt; j++) {
					bulb[num * j] = (bulb[num * j] + 1) % 2;
				}
			} else {
				int cnt = (num - 1 > N - num) ? N - num : num - 1;
				bulb[num] = (bulb[num] + 1) % 2;
				for (int j = 1; j <= cnt; j++) {
					if (bulb[num - j] == bulb[num + j]) {
						bulb[num - j] = (bulb[num - j] + 1) % 2;
						bulb[num + j] = (bulb[num + j] + 1) % 2;
					} else
						break;
				}
			}
		}
		for (int i = 1; i <= N; i++) {
			System.out.print(bulb[i] + " ");
			if (i % 20 == 0)
				System.out.println();
		}
		System.out.println();
	}
}
