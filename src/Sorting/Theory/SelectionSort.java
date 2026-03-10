package Sorting.Theory;

public class SelectionSort {
    public static int[] selectionSort(int[] input){
        for (int i = 0; i < input.length-1; i++) {
            int min_idx=i;
            for (int j = i+1; j <input.length ; j++) {
                if (input[j]<input[min_idx]){
                    min_idx=j;
                }
            }
            int temp=input[i];
            input[i]=input[min_idx];
            input[min_idx]=temp;
        }
        return input;
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        selectionSort(arr);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
