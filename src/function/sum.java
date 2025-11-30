package function;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        System.out.println( sum3(23,32));
    }
//pass the value of number when yoy are calling the method in main()



    static int sum3(int m,int n){
        int ans1=m+n;
        return ans1;
    }

     public static void sum(){
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
