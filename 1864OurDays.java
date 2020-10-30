import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

Scanner in= new Scanner(System.in);
		
		
 int i,n;
 char[] a=new char[34];
  a[34]={'L','I','F','E',' ','I','S',' ','N','O','T',' ','A',' ','P','R','O','B','L','E','M',' ','T','O',' ','B','E',' ','S','O','L','V','E','D'};
  
  n=in.nextInt();
  
  if(n>=1 && n<=34){
  	for(i=0; i<=n; i++){
  		
  System.out.print(a[i]);
  	}
  System.out.println();
  	
  	}
	}
}