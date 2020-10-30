import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
Scanner in= new Scanner(System.in);

double n,sum=0;
 System.out.print("Enter a last number:");
 
 n=in.nextDouble();
 
 for(double i=1.5; i<=n; i++){	
 sum=sum+i;
 System.out.println(i);
 }
 System.out.println();
 System.out.printf("Sum = %.3f\n",sum);
	}
}