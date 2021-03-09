import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2669_B2_직사각형네개의합집합의면적구하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[][] square = new int[4][4];
		StringTokenizer st = null;
		for (int i = 0; i < 4; i++) {
			st = new StringTokenizer(bf.readLine());
			for (int j = 0; j < 4; j++) {
				square[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int [][] map = new int[100][100];
		
		int size = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = square[i][0]; j < square[i][2]; j++) {
				for (int k = square[i][1]; k < square[i][3]; k++) {
					if(map[j][k] !=0) continue;
					map[j][k] = 1;
					size++;
				}
			}
		}
		System.out.println(size);
	}
}
