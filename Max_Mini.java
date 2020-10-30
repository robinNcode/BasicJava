import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a value for a:");
		int a = in.nextInt();

		System.out.print("Enter a value for b:");
		int b = in.nextInt();

		System.out.print("Enter a value for c:");
		int c = in.nextInt();

		int d = Math.max(a, b);
		int max = Math.max(d, c);

		System.out.println("Maximum between a,b,c = " + max);

		int e = Math.min(a, b);
		int min = Math.min(e, c);

		System.out.println("Minimum between a,b,c = " + min);
	}
}