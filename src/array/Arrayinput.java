package array;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayinput {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
//        int [] arr=new int[5];
//
//        for(int i=0;i<arr.length;i++){
//            arr[i]=in.nextInt();
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//
//        for(int num : arr){
//            System.out.println(num+" ");
//        }

        String[] str=new String[3];

        for(int i=0;i<str.length;i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));

//        modify
        str[1]="krishna";
    }
}
