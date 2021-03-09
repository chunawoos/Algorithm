import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2839_B1_설탕배달 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int cnt = 0;
		int five = N/5;
		int min = Integer.MAX_VALUE;
		boolean isCal = false;
		for (int i = 0; i <= five; i++) {
			cnt = i;
			int left = N - cnt*5;
			if(left%3 != 0) continue;
			cnt += left/3;
			min = min < cnt ? min : cnt;
			isCal = true;
		}
		if(isCal) {
			System.out.println(min);
		} else {
			System.out.println(-1);
		}
		
	}
}
