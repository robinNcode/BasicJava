package BasicJava;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number:");

		n = input.nextInt();

		System.out.println("Number is =" + n);
	}

}
