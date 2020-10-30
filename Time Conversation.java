/* MsM Robin
   Sonargaon University
*/

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
	
Scanner input= new Scanner(System.in);
int N,h,m,s;

N=input.nextInt();

h=N/3600;
N=N%3600;
m=N/60;
s=N%60;

System.out.printf("%d hr : %d min : %d sec\n",h,m,s);
	}
}