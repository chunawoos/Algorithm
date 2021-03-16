import java.util.Scanner;

public class Div {

	public static void main(String[] args) {
		int testCase;
		int divisor;
		int dividend;
		Scanner sc = new Scanner(System.in);

		testCase = sc.nextInt();
		for (int tc = 1; tc <= testCase; tc++) {
			divisor = sc.nextInt();
			dividend = sc.nextInt();

			System.out.println("#" + tc + " " + divisor / dividend + " " + divisor % dividend);
		}
	}

}
