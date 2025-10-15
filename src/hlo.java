

//public class Stl extends Callpublic {
//    @Override
//    void printFroClass() {
//        super.printFroClass();
//        System.out.println("i will change your property and access out side the class "+str);
//    }
//
//
//    public static void main(String[] args) {
//Stl obj3=new Stl();
//        obj3.printFroClass();
//    }
//
//}
public class hlo extends App2{
    @Override
    void printFromOutsideclass() {
        super.printFromOutsideclass();
        System.out.println("App2 class i have changed you property and access from the out side class");

    }
    public static void main(String[] args) {
        hlo obj5=new hlo();
        obj5.printFromOutsideclass();
    }
}