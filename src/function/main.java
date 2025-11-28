package function;

import java.util.Scanner;

public class main {
    public static void main (String[] args) {
//        take input of 2 number and print the sum
        Scanner sc=new Scanner(System.in);
        int a,b,sum;
        System.out.println("enter the number 1 : ");
         a=sc.nextInt();
        System.out.println("enter the number 2 : ");
        b=sc.nextInt();
         sum=a+b;
        System.out.println("the sum is.."+sum);

    }
}
