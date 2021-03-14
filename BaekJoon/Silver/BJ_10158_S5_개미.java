import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10158_S5_개미 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine());
		int antX = Integer.parseInt(st.nextToken());
		int antY = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(bf.readLine());
		antX += T % (2 * x);
		antY += T % (2 * y);
		if (antX > 2 * x) {
			antX -= 2 * x;
		} else if (antX > x)
			antX = 2 * x - antX;
		if (antY > 2 * y) {
			antY -= 2 * y;
		} else if (antY > y)
			antY = 2 * y - antY;
		System.out.println(antX + " " + antY);
	}
}
