public class Main {
	public static void main(String[] args) {
		
		double s=0,c=1,i,b=1;
  
for (i=1; i<=39; i+=2){

    c=i/b;
        s+=c;
    b*=2;
        
//System.out.printf("%.2f / %.2f = %.2f\n",i,b,c);
    
  }
  
 System.out.printf("%.2f\n",s);
	}
}