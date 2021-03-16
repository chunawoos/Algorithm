import java.util.Scanner;

public class AlpatoInt {

	public static void main(String[] args) {
		String alpa;
		char[] c;
		Scanner sc = new Scanner(System.in);
		alpa = sc.next();
		c = alpa.toCharArray();

		for (int i = 0; i < alpa.length(); i++)
			System.out.printf("%d ", c[i] - 64);
	}

}
