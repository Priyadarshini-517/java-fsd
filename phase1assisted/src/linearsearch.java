
import java.util.Scanner;

public class linearsearch {

	public static void main(String[] args){

	        int[] arr = {10,20,30,40,50};

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the element to be searched");
	        int searchvalue = sc.nextInt();
	        int count=0;
	           
		    for (int i = 0; i < arr.length - 1; i++) {

		        if (arr[i] == searchvalue) {
		        		count+=1;
		            System.out.println("element is present in array in position "+(i+1));
		            break;}}
		        if (count==0) {
		        	System.out.println("element not found");
		        }
}}