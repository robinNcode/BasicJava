import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

Scanner in = new Scanner(System.in);

int n = in.nextInt();

for(int i=1; i<=n; i++){
    
    int a=i*i;
    int b=i*i*i;
        
System.out.printf("%d %d %d\n",i,a,b);
       }
	}
}