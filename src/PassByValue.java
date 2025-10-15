public class PassByValue{
//    pass by value means jo fun ya method me parameter pass hua hai uska copy banata hai
    static void value(int a,int b){
        int c=b-a;
        System.out.println("inside change the value " +c);
    }

    public static void main(String[] args) {
        int q=10;
        int r=18;
        System.out.println("before changing the value "+(q+r));
        //int a ek copy banyega wo q hai
        //int b ek copy banyega wo r hai
        value(q,r);
        System.out.println("after changing the value "+(q*r));
    }

}
