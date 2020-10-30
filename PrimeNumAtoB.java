import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
	
 int a=in.nextInt();
 int b=in.nextInt();
 
 if(a<b){
	
for(int i=a; i<=b; i++){
 		int sum=0;
 		
 	for(int j=1; j<=i; j++){
 	
 	if(i%j==0){
 	      sum=sum+j;
 		      }
 			}

if(sum==1){
 	
 System.out.printf("%d is a Prime Number!!\n",i);
  
   }
   
 else if(sum==i+1){
 	
 System.out.printf("%d is a Prime Number!!\n",i);
 
   }
  else 	
 System.out.printf("%d is not a Prime Number.\n",i);	
	}
 		}
 else {
 	
  for(int i=b; i<=a; i++){
 	int sum=0;
 	for(int j=1; j<=i; j++){
 		
 	if(i%j==0){
 	      sum=sum+j;
 		      }
 		
 		}

if(sum==1){
 	
 System.out.printf("%d is a Prime Number!!\n",i);
 
   }
   
 else if(sum==i+1){
 	
 System.out.printf("%d is a Prime Number!!\n",i);
   }
  else 	
 System.out.printf("%d is not a Prime Number.\n",i);	
	}	
 	}
}

}