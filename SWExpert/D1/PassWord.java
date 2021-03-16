import java.util.Scanner;

public class PassWord {
	public static void main(String[] args) {
		int pass;
		int cur;
		Scanner sc = new Scanner(System.in);
		pass = sc.nextInt();
		cur = sc.nextInt();
		System.out.println(pass - cur + 1);
	}
}
