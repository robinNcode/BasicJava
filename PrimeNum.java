import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
Scanner in=new Scanner(System.in);

	int sum=0;
	
 int n=in.nextInt();
	
 for(int i=1; i<=n; i++){
 	if(n%i==0){
 	
 		sum=sum+i;
 		}
 		
 		}
 if(sum==n+1){
 	
 System.out.printf("%d is a Prime Number!!",n);
   }
  else 	
 System.out.printf("%d is not a Prime Number!!",n);	
	}
}