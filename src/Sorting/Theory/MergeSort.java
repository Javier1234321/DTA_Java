package Sorting.Theory;

public class MergeSort {
    public static void merge(int[] input,int l,int m, int r){
        int n1=m-l+1;
        int n2=r-m;

        int[] leftArray=new int[n1];
        int[] rigthArray=new int[n2];

        for (int i = 0; i < n1; ++i) {
            leftArray[i]=input[l+i];

        }

        for (int j = 0; j < n2; ++j) {
            rigthArray[j]=input[m+1+j];
        }

        int i=0, y=0;
        int k=l;

        while(i<n1 && y<n2){
            if (leftArray[i]<=rigthArray[y]){
                input[k]=leftArray[i];
                i++;
            }
            else{
                input[k]=rigthArray[y];
                y++;
            }
            k++;
        }

        while (i<n1){
            input[k]=leftArray[i];
            k++;
            i++;
        }


        while (y<n2){
            input[k]=rigthArray[y];
            k++;
            y++;
        }
    }

    public static void mergeSort(int[] input,int l, int r){
        if (l<r){
            int m=l+(r-l)/2;
            mergeSort(input,l,m);
            mergeSort(input,m+1,r);
            merge(input,l,m,r);
        }

    }

    public static void main(String[] args) {
        int arr[] = {38, 27, 43, 10};

        mergeSort(arr, 0, arr.length -1);

        int n = arr.length;
        for (int i = 0; i < n; ++i){
            System.out.print(arr[i] + " ");
        System.out.println();}
    }
}
