import java.util.Scanner;

		public class Main {
			public static void main(String[] args) {

Scanner in = new Scanner(System.in);

int i, sum = 0;

System.out.print("Enter a initial value for m:");
int m = in.nextInt();

System.out.print("Enter a final value for n:");
int n = in.nextInt();

	if (m % 2 == 0) {
		
			m = m + 1;
			
	for (i = m; i <= n; i += 2) {
		
		sum = sum + i;

 System.out.println(i);
 
					}
	System.out.println("Sum of all the odd numbers between m to n is = " + sum);
			}
	else {
for (i = m; i <= n; i += 2) {
	
		sum = sum + i;
			
 System.out.println(i);
					}
System.out.println("Sum of all the odd numbers between m to n is = " + sum);
				}
			}
		}
