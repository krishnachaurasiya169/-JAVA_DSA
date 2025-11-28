package function;

import java.util.Scanner;

public class sum {
     public void sum(){
         Scanner sc=new Scanner(System.in);
         int a,b,sum;
         System.out.println("enter the number 1 : ");
         a=sc.nextInt();
         System.out.println("enter the number 2 : ");
         b=sc.nextInt();
         sum=a+b;
         System.out.println("the sum is.."+sum);
     }
    public static void main(String[] args) {
      sum s1=new sum();
      s1.sum();
    }
}
