import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

Scanner in = new Scanner(System.in);

	int t = in.nextInt();

		for (int i = 1; i <= t; i++) {

			int a = in.nextInt();

			if (a % 2 == 0) {
		System.out.println("0");
			} 
			else
		System.out.println("1");
		}
	}
}