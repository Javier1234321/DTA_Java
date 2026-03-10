package Arrays.Exercises.Basics;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Leaders in an array
 * Last Updated : 22 Jan, 2026
 * Given an array arr[] of size n, the task is to find all the Leaders in the array. An element is a Leader if it is greater than or equal to all the elements to its right side.
 *
 * Note: The rightmost element is always a leader.
 *
 * Examples:
 *
 * Input: arr[] = [16, 17, 4, 3, 5, 2]
 * Output: [17 5 2]
 * Explanation: 17 is greater than all the elements to its right i.e., [4, 3, 5, 2], therefore 17 is a leader. 5 is greater than all the elements to its right i.e., [2], therefore 5 is a leader. 2 has no element to its right, therefore 2 is a leader.
 *
 * Input: arr[] = [1, 2, 3, 4, 5, 2]
 * Output: [5 2]
 * Explanation: 5 is greater than all the elements to its right i.e., [2], therefore 5 is a leader. 2 has no element to its right, therefore 2 is a leader.
 * */
public class LeadersInAnArray {
    public static void main(String[] args) {
        int [] input={16, 17, 4, 3, 5, 2};
        for(int out: solve1(input)){
            System.out.println("out = " + out);
        }
        for(int out: solve2(input)){
            System.out.println("out = " + out);
        }
    }
    public static ArrayList<Integer> solve1(int[] input){
        ArrayList<Integer> output= new ArrayList<>();
        int pivot;
        boolean b;
        for (int i = 0; i < input.length; i++) {
            pivot=input[i];
            b=true;
            for (int j = i+1; j < input.length; j++) {
                if (pivot<input[j]){
                  b=false;
                }
            }
            if (b){
                output.add(pivot);
            }
        }
        return output;
    }
    public static ArrayList<Integer> solve2(int[] input){
        ArrayList<Integer> output= new ArrayList<>();
        int maxRight=input[input.length-1];
        int size=input.length;
        output.add(maxRight);
        for (int i = size-2; i >=0 ; i--) {
            if (maxRight<=input[i]){
                maxRight=input[i];
                output.add(maxRight);
            }
        }
        Collections.reverse(output);
        return output;
    }
}
