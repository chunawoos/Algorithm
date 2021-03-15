import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_14888_S1_연산자끼워넣기 {

	static int max, min, N;
	private static int[] oper, num, order;

	final static int PLUS = 1;
	final static int MINUS = 2;
	final static int MUL = 3;
	final static int DIV = 4;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		num = new int[N];
		order = new int[N];
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		oper = new int[5];
		st = new StringTokenizer(bf.readLine());
		for (int i = 1; i < 5; i++) {
			oper[i] = Integer.parseInt(st.nextToken());
		}
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		calculate(1);
		System.out.println(max);
		System.out.println(min);
	}

	public static void calculate(int depth) {

		if (depth == N) {
			int res = num[0];
			for (int i = 1; i < N; i++) {
				switch (order[i]) {
				case PLUS:
					res += num[i];
					break;
				case MINUS:
					res -= num[i];
					break;
				case MUL:
					res *= num[i];
					break;
				case DIV:
					res /= num[i];
					break;
				}
			}
			max = max > res ? max : res;
			min = min < res ? min : res;
			return;
		}

		for (int i = 1; i < 5; i++) {
			if (oper[i] == 0)
				continue;
			order[depth] = i;
			oper[i]--;
			calculate(depth + 1);
			oper[i]++;
		}
	}
}
