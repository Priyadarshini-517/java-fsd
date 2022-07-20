import java.util.*;
	public class calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two operands");
		double a= sc.nextDouble(); //reading the operands as input
		double b=sc.nextDouble();
		System.out.println("enter the operation to be performed: + or _ or * or / ");
		final char c= sc.next().charAt(0);
		switch(c) {
		case '+':
			System.out.println("a+b="+(int)(a+b));//type casting
			break;
		case '-':
			System.out.println("a-b="+(a-b));
			break;
		case '*':
			System.out.println("a*b="+(a*b));
			break;
		case '/':
			System.out.println("a/b="+(a/b));
			break;
			default:
				System.out.println("invalid option");
		}
	}
	}
