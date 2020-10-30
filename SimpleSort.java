import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int y = Math.max(a, b);
		    y = Math.max(y, c);
		
		int x = Math.min(a, b);
		    x = Math.min(x, c);

if((a==x && b==y)||(b==x && a==y)){
System.out.println(x);
System.out.println(c);
System.out.println(y);
}

else if((b==x && c==y)||(c==x && b==y)){
System.out.println(x);
System.out.println(a);
System.out.println(y);
}
else if((a==x && c==y)||(c==x && a==y)){
System.out.println(x);
System.out.println(b);
System.out.println(y);
}

System.out.println();
System.out.println(a);
System.out.println(b);
System.out.println(c);	
	}
}