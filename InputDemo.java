package BasicJava;

import java.util.Scanner;

public class InputDemo {

  public static void main(String[] args) {
int a,b,c;
Scanner input = new Scanner(System.in);

System.out.print("Enter a number:");

a= input.nextInt();
b=input.nextInt();
c=a+b;
System.out.println("Number is = "+c);
  }

}
