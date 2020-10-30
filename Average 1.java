import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b, z;

		a = input.nextDouble();
		b = input.nextDouble();

z =((a * 3.5)+(b * 7.5))/(3.5 + 7.5);

System.out.printf("MEDIA = %.5f\n",z);
	}
}