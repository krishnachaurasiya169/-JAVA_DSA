package array;

import java.util.Arrays;
import java.util.Scanner;

public class multidimesionarray {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int[][] arr2d = new int[3][3];

//        int [][] arr2d={
//                {1,2,3}, // 0th index
//                {8,0},  //1st index
//                {3,4,5,7,6} //2nd index
//        };

//        input
        for(int row=0;row<arr2d.length;row++){
            for(int col=0;col< arr2d[row].length;col++){
                arr2d[row][col]=in.nextInt();
            }
        }
//
        for(int row=0;row<arr2d.length;row++){
            for(int col=0;col< arr2d[row].length;col++){
                System.out.print(arr2d[row][col]+" ");
            }
            System.out.println();
        }


    }
}
