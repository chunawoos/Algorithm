import java.util.Arrays;
import java.util.Scanner;

public class Flatten2 {
	public static void main(String[] args) {
		int[] box = new int[100];
		int dump;
		int sub;
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			dump = sc.nextInt();
			for (int i = 0; i < 100; i++)
				box[i] = sc.nextInt();
			Arrays.sort(box);
			for (int i = 0; i < dump; i++) {
				box[0] += 1;
				box[99] -= 1;
				Arrays.sort(box);
			}
			System.out.println("#" + tc + " " + Math.abs(box[99] - box[0]));
		}
	}
}
