import java.util.*;

public class mailvalidation {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//creating an arraylist of string
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("emp1@mail.com");
		l1.add("emp2@mail.com");
		l1.add("emp3@mail.com");
		l1.add("emp4@mail.com");
		System.out.println("enter the employee mail id");
		String a=sc.nextLine();
		//checking if the entered mail is in the arraylist
		if(l1.contains(a)) {
			System.out.println(a+" is a valid employee mail id");
		}
		else
			System.out.println(a+" is a invalid employee email id");
		
	}
}
 
 
