public class bubblesort {


    public static void main(String[] args){

     int[] arr= {34,67,18,42,19};
     bubblesort(arr);
     for(int i=0;i<arr.length;i++){

        System.out.print(arr[i]+"\t");
        }
    }

    public static void bubblesort(int[] arr){
        int length = arr.length;
        int temp = 0;
        for(int i=0;i<length;i++){
            for (int j=1;j<(length);j++){
                if(arr[j-1]>arr[j]){
                temp = arr[j-1];
                arr[j-1]= arr[j];
                arr[j]= temp;

                }


            }

        }

    }

}


