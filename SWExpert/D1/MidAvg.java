import java.util.Arrays;
import java.util.Scanner;

public class MidAvg {
	public static void main(String[] args) {
		int testCase;
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);

		testCase = sc.nextInt();

		for (int tc = 1; tc <= testCase; tc++) {

			for (int i = 0; i < 10; i++)
				arr[i] = sc.nextInt();
			Arrays.sort(arr);
			float sum = 0;
			for (int i = 1; i < 9; i++)
				sum += arr[i];
			sum /= 8;
			int avg = Math.round(sum);

			System.out.println("#" + tc + " " + avg);
		}
	}

}
