package Arrays.Exercises.Basics;

import java.util.ArrayList;

/*
*Alternate elements of an array
Last Updated : 4 Dec, 2024
Given an array arr[], the task is to print every alternate element of the array starting from the first element.

Examples:

Input: arr[] = [10, 20, 30, 40, 50]
Output: 10 30 50
Explanation: Print the first element (10), skip the second element (20), print the third element (30), skip the fourth element(40) and print the fifth element(50).

Input: arr[] = [-5, 1, 4, 2, 12]
Output: -5 4 12
*
* */
public class AlternateElementsOfAnArray {

    public static void main(String[] args) {
        int[] input={1,2,3,4,5,6,7,8,9};
        for(int out : problem1(input)){
            System.out.print("|" + out+"|");
        }
    }

    public static ArrayList<Integer> problem1(int[] input){
        ArrayList<Integer> output=new ArrayList<>();
        for(int i=0;i<input.length;i+=2) {
            output.add(input[i]);
        }
        return output;
    }

}
