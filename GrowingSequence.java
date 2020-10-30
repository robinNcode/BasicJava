import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
Scanner in = new Scanner(System.in);
	

while(true){

int n = in.nextInt();

if(n==0)break;

for(int i=1; i<n; i++){

System.out.print(i+" ");

}

System.out.println(n);


}

	}
}