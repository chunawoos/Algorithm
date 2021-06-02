import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sw_12004_D3_구구단1 {
	 public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(bf.readLine());
		
		for (int tc = 1; tc <= T; tc++) {
			double N = Double.parseDouble(bf.readLine());
			boolean isWrong = true;
			for (int i = 1; i < 10; i++) {
				if(N/i == 1 || N/i == 2 || N/i == 3 || N/i == 4 ||  N/i == 5 || N/i == 6 
						|| N/i == 7 || N/i == 8 || N/i == 9) {
					sb.append("#").append(tc).append(" Yes\n");
					isWrong = false;
					break;
				}
			}
			if(isWrong) {
				sb.append("#").append(tc).append(" No\n");
			}
		}
		System.out.println(sb);
	}
}
