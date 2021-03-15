import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_B2_2231_분해합 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		boolean success = false;
		for (int i = 1; i < N; i++) {
			int sum = i;
			for (int j = 1; j <= (int) (Math.log10(i) + 1); j++) {
				sum += i % (int) (Math.pow(10, j)) / (int) (Math.pow(10, j - 1));
			}
			if (sum == N) {
				System.out.println(i);
				success = true;
				break;
			}
		}
		if (!success) {
			System.out.println(0);
		}
	}
}
