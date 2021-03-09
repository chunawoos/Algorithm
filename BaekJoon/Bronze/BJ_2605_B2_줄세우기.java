import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ_2605_B2_줄세우기 {
	
	static int [] line;
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		line = new int[N];
		for(int i=0; i<N;i++) {
			line[i] = i+1;
		}
		Stack<Integer> result = new Stack<>();
		Stack<Integer> tmp = new Stack<>();
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0; i<N; i++) {
			int cnt = Integer.parseInt(st.nextToken());
			for (int j = 0; j < cnt; j++) {
				tmp.push(result.pop());
			}
			result.push(line[i]);
			while(!tmp.isEmpty()) {
				result.push(tmp.pop());
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.print(result.get(i)+" ");			
		}
		System.out.println();
	}
}
