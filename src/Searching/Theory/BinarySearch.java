package Searching.Theory;

public class BinarySearch {
    public static int binarySearch(int[] input, int low, int high, int x){
        if (high>=low){
            int mid=low+(high-low)/2;
            if (input[mid]==x){
                return mid;
            }
            if (input[mid]>=x){
                return binarySearch(input,low,mid-1,x);
            }
            return binarySearch(input,mid+1,high,x);


        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println(
                    "Element is present at index " + result);
    }
}
