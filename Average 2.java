import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
Scanner input= new Scanner(System.in);   
float A,B,C,m;

 A=input.nextFloat();
 B=input.nextFloat();
 C=input.nextFloat();
   
  m=(A*2+B*3+C*5)/(2+3+5);
System.out.printf("MEDIA = %.1f\n",m);

    
	}
}