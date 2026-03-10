package Sorting.Theory;

public class InsertionSort {
    public static int[] insertionSort(int[] input){
        for (int i = 1; i < input.length ; i++) {
            int key=input[i];
            int j=i-1;
            while(j>=0 && input[j]>key){
                input[j+1]=input[j];
                j--;
            }
            input[j+1]=key;
        }
        return input;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };

        insertionSort(arr);
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
    }
}
