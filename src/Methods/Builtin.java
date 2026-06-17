package Methods;

import java.util.Scanner;

public class Builtin {

    static void main() {
        System.out.println(Math.sqrt(289));
        System.out.println(Math.cbrt(27));
        System.out.println(Math.min(2,4));
        System.out.println(Math.max(434,343));
        Scanner sc= new Scanner(System.in);


        System.out.println(Math.pow(-2.33,-4.432));
        System.out.println("enter the number ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        System.out.println(Math.max(Math.max(a,b),c));
        System.out.println(Math.max(Math.max(a,b),Math.max(c,d)));
    }
}
