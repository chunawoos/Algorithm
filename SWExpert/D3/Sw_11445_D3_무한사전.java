import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sw_11445_D3_무한사전 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());

		for (int tc = 1; tc <= T; tc++) {
			String P = bf.readLine();
			String Q = bf.readLine();
			int len = P.length() > Q.length() ? P.length() : Q.length();
			int[] first = new int[len];
			int[] second = new int[len];
			for (int i = 0; i < P.length(); i++) {
				first[i] = P.charAt(i) - 96;
			}
			for (int i = 0; i < Q.length(); i++) {
				second[i] = Q.charAt(i) - 96;
			}
			int dif = 0;
			for (int i = 0; i < len; i++) {
				dif += Math.abs(first[i] - second[i]);
			}
			if (dif > 1) {
				System.out.println("#" + tc + " Y");
			} else if (dif == 1 && P.length() == Q.length() && first[len - 1] != second[len - 1]) {
				System.out.println("#" + tc + " Y");
			} else {
				System.out.println("#" + tc + " N");
			}
		}
	}
}
