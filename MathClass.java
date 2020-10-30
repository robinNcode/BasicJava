import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

Scanner in = new Scanner(System.in);

		System.out.print("Enter a posetive value for x:");
		int x = in.nextInt();

		System.out.print("Enter a negative value for y:");
		int y = in.nextInt();

		int max = Math.max(x, y);
		System.out.println("Maximum = " + max);

		int min = Math.min(x, y);
		System.out.println("Minimum = " + min);

		double pow = Math.pow(x, y);
		System.out.printf("x to the power y = %.4f\n", pow);

		int abs = Math.abs(y);
		System.out.println("Absulate value of y = " + abs);

		int round = Math.round(8.8f);
		System.out.println("Round value of 8.8 = :" + round);

	}
}