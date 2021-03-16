import java.util.Scanner;

public class Flatten {
	public static void main(String[] args) {
		int[] box = new int[100];
		int dump;
		int max, pax;
		int min, pin;
		Scanner sc = new Scanner(System.in);

		for (int tc = 1; tc <= 10; tc++) {
			dump = sc.nextInt();
			max = 0;
			pax = 0;
			min = 100;
			pin = 0;
			for (int i = 0; i < 100; i++) {
				box[i] = sc.nextInt();
				if (box[i] > max) {
					max = box[i];
					pax = i;
				}
				if (box[i] < min) {
					min = box[i];
					pin = i;
				}
			}

			for (int i = 0; i < dump; i++) {
				box[pax] -= 1;
				box[pin] += 1;
				max -= 1;
				min += 1;
				for (int j = 0; j < 100; j++) {
					if (box[j] > max) {
						max = box[j];
						pax = j;
					}
					if (box[j] < min) {
						min = box[j];
						pin = j;
					}
				}
			}
			System.out.println("#" + tc + " " + Math.abs(box[pax] - box[pin]));

		}
		sc.close();
	}
}
