package Searching.Theory;

import javax.sound.midi.MidiFileFormat;

/**
 * Linear Search – O(n) Time and O(1) Space
 * It is the simplest searching algorithm that checks each element sequentially until the key is found or the collection is fully traversed. Works on both sorted and unsorted data. For more details
 * */
public class LinearSearch {
    public static int search(int arr[],int  x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] input={10, 50, 30, 70, 80, 20, 90, 40};
        if (search(input,30)!=-1){
            System.out.println("Valor encontrado");
        }
        else {
            System.out.println("Valor no encontrado");
        }
    }

}
