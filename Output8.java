public class Main {
	public static void main(String[] args) {
		
double a=234.345000;
double b=45.698000;

System.out.printf("%.6f - %.6f\n",a,b);

System.out.println(Math.round(a)+" - "+Math.round(b));
    
System.out.printf("%.1f - %.1f\n",a,b);

System.out.printf("%.2f - %.2f\n",a,b);

System.out.printf("%.3f - %.3f\n",a,b);

System.out.print(String.format("%e",a));
System.out.println(" - "+String.format("%e",b));

System.out.print(String.format("%E",a));
System.out.println(" - "+String.format("%E",b));

System.out.println(a+" - "+b);
System.out.println(a+" - "+b);

	}
}