import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sw_1204_D2_최빈수구하기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bf.readLine());

		for (int tc = 1; tc <= testCase; tc++) {
			bf.readLine();
			String[] tmp = bf.readLine().split(" ");
			int[] score = new int[101];
			for (int i = 0; i < tmp.length; i++) {
				score[Integer.parseInt(tmp[i])]++;
			}
			int max = 0, sc = 0;
			for (int i = 0; i <= 100; i++) {
				if (max < score[i]) {
					max = score[i];
					sc = i;
				} else if (max == score[i]) {
					if (sc < i)
						sc = i;
				}
			}
			System.out.println("#" + tc + " " + sc);
		}
	}
}
