import java.util.Scanner;

public class main1 {
//    means that it is present in class known as class level scope a,b
    int a=10;
    int b=13;
int add(){
    return a+b;
}
int sub(){
    return a-b;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
        int b=sc.nextInt();
        main1 m1= new main1();
        System.out.println("sum is "+m1.add());
        System.out.println("sub is "+m1.sub());
    }
}
