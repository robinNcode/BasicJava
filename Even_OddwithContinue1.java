public class Main {
	public static void main(String[] args) {
		
int r,m=0;

for(r=1; r<=100; r++){
	
	if(r%2==0){
		continue;
		}
		m++;
 System.out.printf("%d\t",r);
  if(m==3){
  System.out.println();
  m=0;
  	}
}
System.out.println("\n");

int s,t=0;
for(s=1; s<=100; s++){
	
	if(s%2!=0){
		continue;
		}
		t++;
 System.out.printf("%d\t",s);
  if(t==3){
  System.out.println();
  t=0;
  	}
}
	}
}