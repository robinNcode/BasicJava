import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
Scanner in = new Scanner(System.in);

		int i, sum = 0;

		System.out.print("Enter a initial value for m:");
		int m = in.nextInt();

		System.out.print("Enter a final value for n:");
		int n = in.nextInt();

		for (i = m; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of all the numbers From m to n is = " + sum);
		
	}
}