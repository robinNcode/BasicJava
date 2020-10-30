import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		float[] a;
		a = new float[100];
		int i, j;

		for (j = 0; j < 100; j++) {

			a[j] = in.nextFloat();

			if (a[j] <= 10) {

System.out.printf("A[%d] = %.1f\n",j,a[j]);

			}

		}

	}
}