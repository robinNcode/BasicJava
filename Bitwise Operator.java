import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
Scanner in = new Scanner(System.in);

System.out.print("Enter a value for a :");
int a=in.nextInt();

System.out.print("Enter a value for b :");
int b=in.nextInt();
int c;

c=a&b;
System.out.printf("a&b = %d\n",c);

c=a|b;
System.out.printf("a|b = %d\n",c);

c=a^b;
System.out.printf("a^b = %d\n",c);

c=a>>3;
System.out.printf("a>>3 = %d\n",c);

c= a<<2;
System.out.printf("a<<2 = %d\n",c);

	}
}