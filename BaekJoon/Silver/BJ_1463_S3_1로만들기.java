import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_1463_S3_1로만들기 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[] D = new int[N + 1];

		int min;
		for (int i = 2; i <= N; i++) {
			min = Integer.MAX_VALUE;
			if (i > 1 && D[i - 1] + 1 < min)
				min = D[i - 1] + 1;
			if (i % 3 == 0 && D[i / 3] + 1 < min)
				min = D[i / 3] + 1;
			if (i % 2 == 0 && D[i / 2] + 1 < min)
				min = D[i / 2] + 1;

			D[i] = min;
		}
		System.out.println(D[N]);
	}
}
