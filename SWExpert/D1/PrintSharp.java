import java.util.Scanner;

public class PrintSharp {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.print("#");
		}

	}

}
