import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ_1904_S3_01타일 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());

		int[] fib = new int[N + 1];
		fib[0] = 1;
		fib[1] = 1;
		for (int i = 2; i <= N; i++) {
			fib[i] = (fib[i - 1] + fib[i - 2]) % 15746;
		}
		System.out.println(fib[N]);
	}
}
