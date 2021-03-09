import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2953_B1_요리사 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int [][] score = new int[5][4];
		int winner = 0;	int max = 0;
		for(int i=0; i<5; i++) {
			st = new StringTokenizer(bf.readLine());
			int sum = 0;
			for (int j = 0; j < 4; j++) {
				score[i][j] = Integer.parseInt(st.nextToken());
				sum += score[i][j];
			}
			if(max < sum) { 
				max = sum;
				winner = i+1;
			}
		}
		
		System.out.println(winner+" "+max);
		
	}
}
