public class Callpublic {

   public String str="hlo my name is krishna";
    void printFroClass(){
        System.out.println("within class : "+str);
    }

    public static void main(String[] args) {
        Callpublic obj=new Callpublic();
        obj.printFroClass();
        System.out.println(obj.str);
        App2 obj2=new App2();
        obj2.printFromOutsideclass();
    }
}
class App2{
void printFromOutsideclass(){
    Callpublic obj=new Callpublic();
    System.out.println("outside the class"+obj.str);
}
}