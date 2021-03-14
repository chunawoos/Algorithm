import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_1920_S4_수찾기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[] A = new int[N];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		int M = Integer.parseInt(bf.readLine());
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < M; i++) {
			int search = Integer.parseInt(st.nextToken());
			int start = 0;
			int end = N - 1;
			int mid = (start + end) / 2;
			if (search > A[end] || search < A[start]) {
				System.out.println(0);
				continue;
			}
			while (true) {
				if (search == A[end]) {
					System.out.println(1);
					break;
				} else if (search == A[start]) {
					System.out.println(1);
					break;
				} else if (search == A[mid]) {
					System.out.println(1);
					break;
				} else if (search > A[mid]) {
					start = mid;
					mid = (start + end) / 2;
					if (mid == start) {
						System.out.println(0);
						break;
					}
				} else if (search < A[mid]) {
					end = mid;
					mid = (start + end) / 2;
					if (mid == start) {
						System.out.println(0);
						break;
					}
				}
			}
		}

	}
}
