import java.util.Scanner;

class Algebra{
    int add(int a,int b){
         return a+b;
    }

}
public class Main {
    public static void main(String[] args) {
    Algebra addnumber=new Algebra();
Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
 int b=sc.nextInt();
        System.out.println("sum of input is :"+addnumber.add(a,b));
//       int ans =  addnumber.add(a,b);

    }
}