package Sorting.Theory;

public class BubbleSort {
    public static int[] bubbleSort(int[] input){
        int aux;
        boolean isEqual=true;
        for (int i = 0; i < input.length-1; i++) {
            for (int j = 0; j < input.length-1-i; j++) {
                if (input[j]>input[j+1]){
                    aux=input[j];
                    input[j]=input[j+1];
                    input[j+1]=aux;
                    isEqual=false;
                }
            }
            if (isEqual){
                return input;
            }
        }
        return input;
    }
    public static void main(String[] args) {
        int arr[] = { 5, 6, 1, 3 };
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
