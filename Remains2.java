import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

	for (int i = 1; i <= 1000; i++) {

			if (n % i == 2) {

		System.out.println(i);
			}
		}
	}
}