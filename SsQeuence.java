public class Main {
	public static void main(String[] args) {
		
		float c=1,s=0;

for (float i=1; i<=100; i++){
  
 c=1;

  c=c/i;

  s=s+c;
}

System.out.printf("%.2f\n",s);
	}
}