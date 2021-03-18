import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sw_1284_D2_수도요금경쟁 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(bf.readLine());

		for (int tc = 1; tc <= testCase; tc++) {
			String[] tmp = bf.readLine().split(" ");
			int P = Integer.parseInt(tmp[0]);
			int Q = Integer.parseInt(tmp[1]);
			int R = Integer.parseInt(tmp[2]);
			int S = Integer.parseInt(tmp[3]);
			int W = Integer.parseInt(tmp[4]);

			int price = 0;
			if (R > W)
				price = Q;
			else if (R < W) {
				price = Q + (W - R) * S;
			}

			if (price > P * W)
				price = P * W;
			System.out.println("#" + tc + " " + price);
		}
	}

}
