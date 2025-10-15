import java.util.Scanner;

public class Constructor {
    int a;
    int b;

    Constructor(int x, int y) {
        System.out.println("this is a constructor:-");
        a = x;
        b = y;

    }

    int add() {
        return a + b;
    }

    int sub() {
        return a - b;
    }

    int mul() {
        return a * b;
    }


        public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
            Constructor al = new Constructor(x, y);
            System.out.println( al.add());
        System.out.println(al.sub());
        System.out.println(al.mul());
        }
//    }
}
