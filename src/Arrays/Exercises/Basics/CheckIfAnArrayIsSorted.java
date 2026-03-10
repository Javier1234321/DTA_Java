package Arrays.Exercises.Basics;
/**
 * Check if an Array is Sorted
 * Last Updated : 18 Oct, 2025
 * Given an array arr[], check if it is sorted in ascending order or not. Equal values are allowed in an array and two consecutive equal values are considered sorted.
 *
 * Examples:
 *
 * Input: arr[] = [10, 20, 30, 40, 50]
 * Output: true
 * Explanation: The given array is sorted.
 *
 * Input: arr[] = [90, 80, 100, 70, 40, 30]
 * Output: false
 * Explanation: The given array is not sorted.
 * */
public class CheckIfAnArrayIsSorted {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 10, 50 };
        int n = arr.length;

        if (solve1(arr))
            System.out.print("true");
        else
            System.out.print("false");
    }
    public static boolean solve1(int[] input){

        for (int i=0;i<input.length-1;i++){
            if (input[i]>input[i+1]){
                return false;
            }
        }
        return true;
    }
}
