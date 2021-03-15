import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_S5_7568_덩치 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[][] people = new int[N][2];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			people[i][0] = Integer.parseInt(st.nextToken());
			people[i][1] = Integer.parseInt(st.nextToken());
		}
		int[] score = new int[N];
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (people[i][0] > people[j][0] && people[i][1] > people[j][1]) {
					score[j] += 1;
				} else if (people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
					score[i] += 1;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.println(score[i] + 1);
		}
	}
}
