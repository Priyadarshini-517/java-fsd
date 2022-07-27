import java.util.Scanner;

public class binarysearch {

    public static  void main(String[] args){


        int[] arr = {3,6,9,12,15};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched");
        int key = sc.nextInt();
        int arrlength = arr.length;
        binarysearch(arr,0,key,arrlength);
    }

public static void binarysearch(int[] arr, int start, int key, int length){

        int midValue = (start+length)/2;
        while(start<=length){

            if(arr[midValue]<key){

                start = midValue + 1;
            } else if(arr[midValue]==key){
                System.out.println("Element is found at index :"+midValue);
                break;
            }else {

                length=midValue-1;
            }
            midValue = (start+length)/2;
        }
            if(start>length){

                System.out.println("Element is not found");
            }

}

}
