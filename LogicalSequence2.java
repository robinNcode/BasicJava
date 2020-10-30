import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
Scanner in= new Scanner(System.in);

int x,y,m=0;

x=in.nextInt();
y=in.nextInt();
    
    for(int i=1; i<=y; i++){
    
     m++;
        
    if(m==x)System.out.printf("%d",i);
  else System.out.printf("%d ",i);
       
     if(m==x){
        m=0;
System.out.print("\n");
    }  
    
}


}
	}
