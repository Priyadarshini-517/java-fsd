
public class selectionsort {

    public static void main(String[] args) {

    int[] arr = {10,14,2,19,34,6};
    int length = arr.length;
    selectionsort(arr);
    System.out.println("The sorted elements are:");
    for(int i:arr){

        System.out.print(i+"\t");
         }
     }

    public static void selectionsort(int[] arr){

        for(int i=0;i<arr.length-1;i++){

            int index =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){

                    index =j;
                }

            }
            int min = arr[index];
            arr[index]= arr[i];
            arr[i]= min;
        }

    }
}

