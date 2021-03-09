import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_3985_B1_롤케이크 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int [] cake = new int[N+1];
		int A = Integer.parseInt(bf.readLine());
		StringTokenizer st;
		int tmpExp = 0, tmpReal = 0;
		int maxExp = 0, maxReal = 0;
		for (int i = 1; i <= A; i++) {
			st = new StringTokenizer(bf.readLine());
			int cnt = 0;
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			if(tmpExp < end - start + 1) {
				tmpExp = end - start + 1;
				maxExp = i;
			}
			for (int j = start; j <= end; j++) {
				if(cake[j] != 0) continue;
				cake[j] = i;
				cnt++;
			}
			if(tmpReal < cnt) {
				tmpReal = cnt;
				maxReal = i;
			}
		}
		System.out.println(maxExp);
		System.out.println(maxReal);
	}
}
