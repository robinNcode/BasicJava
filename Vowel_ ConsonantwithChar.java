import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
Scanner in = new Scanner(System.in);

char Choice;
	
	while(true){

 System.out.print("Enter a Charecter :");		
	Choice = in.next().charAt(0);
	
switch(Choice){
	
	case 'a':
		System.out.println("Vowel");
		break;
	case 'e':
		System.out.println("Vowel");
		break;
	case 'i':
		System.out.println("Vowel");
		break;
	case 'o':
		System.out.println("Vowel");
		break;
	case 'u':
		System.out.println("Vowel");
		break;
	case 'A':
		System.out.println("Vowel");
		break;
	case 'E':
		System.out.println("Vowel");
		break;
	case 'I':
		System.out.println("Vowel");
		break;
	case 'O':
		System.out.println("Vowel");
		break;
	case 'U':
		System.out.println("Vowel");
		break;
default:
	System.out.printf("%c is a Consonant\n",Choice);
		break;
 }
	}	
		}
}	
