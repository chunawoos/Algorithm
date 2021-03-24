import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1722_S1_순열의순서 {
	private static int N, num, pCnt;
	private static int[] per, select;
	private static boolean[] isSelected;

	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(bf.readLine());

		StringTokenizer st = new StringTokenizer(bf.readLine());

		num = Integer.parseInt(st.nextToken());
		if (num == 1) {
			per = new int[1];
			per[0] = Integer.parseInt(st.nextToken());
		} else {
			per = new int[N];
			for (int i = 0; i < N; i++) {
				per[i] = Integer.parseInt(st.nextToken());
			}
		}
		select = new int[N];
		isSelected = new boolean[N + 1];

		permutation(num, 0);
	}

	private static void permutation(int num, int cnt) {
		if (cnt == N) {
			pCnt++;
			if (num == 1) {
				if (pCnt == per[0]) {
					for (int i = 0; i < N; i++) {
						System.out.print(select[i] + " ");
					}
					System.out.println();
				}
			} else {
				for (int i = 0; i < N; i++) {
					if (select[i] != per[i])
						return;
				}
				System.out.println(pCnt);
			}
			return;
		}

		for (int i = 1; i <= N; i++) {
			if (isSelected[i])
				continue;
			isSelected[i] = true;
			select[cnt] = i;
			permutation(num, cnt + 1);
			isSelected[i] = false;
		}
	}
}
