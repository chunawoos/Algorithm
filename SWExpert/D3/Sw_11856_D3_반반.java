import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sw_11856_D3_반반 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			String S = bf.readLine();
			int [] count = new int[26];
			for (int i = 0; i < S.length(); i++) {
				count[S.charAt(i)-'A']++;
			}
			int res = 0;
			for (int i = 0; i < 26; i++) {
				if(count[i] == 2) res++;
			}
			if(res == 2) {
				System.out.println("#" + tc + " Yes");
			} else {
				System.out.println("#" + tc + " No");
			}
		}
	}
}
