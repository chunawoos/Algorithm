import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sw_1545_D1_거꾸로출력해보아요 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		for (int i = num; i >= 0; i--)
			System.out.print(i + " ");
	}
}
