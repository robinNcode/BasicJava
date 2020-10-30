import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

Scanner in = new Scanner(System.in);

	
	int n = in.nextInt();

	for (int i = 1; i <= 10; i++) {

			int sum = n * i;

 System.out.printf("%d x %d = %d\n", n, i, sum);


		}
	}
}