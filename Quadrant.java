import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

Scanner in=new Scanner(System.in);
int a,b;

    while(true)
{
   a = in.nextInt();
   b = in.nextInt();
   
    if(a==0 || b==0){
      break;
    }

else if(a>0 && b>0){
   System.out.println("primeiro");
    }
else if(a>0 && b<0){
   System.out.print("quarto\n");
    }
else if(a<0 && b<0){
   System.out.print("terceiro\n");
    }
else
   System.out.print("segundo\n");
}
	}
}