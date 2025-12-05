package array;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int [] arr= {1,2,3,6,4,5};
        swap(arr,1,3);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index,int index2){
        int temp=arr[index];
        arr[index]=arr[index2];
        arr[index2]=temp;
    }
}
