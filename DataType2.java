package BasicJava;

import java.util.Scanner;

public class DataType2 {

	public static void main(String[] args) {

Scanner in = new Scanner(System.in);

  boolean b = true;//Dynamic intialization
 System.out.printf("b = %b\n", b);
 
		char c = in.next().charAt(0);
 System.out.printf("c = %c\n", c);
 
		short s = in.nextShort();
 System.out.printf("s = %d\n", s);
 
		int i = in.nextInt();
 System.out.printf("i = %d\n", i);
 
		double d = in.nextDouble();
 System.out.printf("d = %.3f\n", d);
 
		float f = in.nextFloat();
 System.out.printf("f = %.2f\n", f);

	}


}
