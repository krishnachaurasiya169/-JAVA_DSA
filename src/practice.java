public class practice {
    public static void krishna(int n1, int n2) {
        n1--;
        n2 = n2 - 2;
        System.out.println(n1 + ":" + n2);
    }

    public static void main(String[] args) {
        int p = 38;
        int q = 34;
//        1st ye print hoga phir
        System.out.println(p+":"+q);
//        aur phir ye call hoga
        krishna(p, q);


    }
}