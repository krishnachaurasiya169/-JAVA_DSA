

class ArraysExample {
    void demoArrays(){
int [] age = new int[3];
String [] names = new String[3];
age[0]=12;
age[1]=34;
age[2]=43;
//age[4]=43;
        for(int i=0;i<3;i++){
            System.out.println(age[i]);
        }
        names[0]="krishna";
        names[1]="manish";
        names[2]="kishan";
        for (int i=0;i<3;i++){
            System.out.println(names[i]);
        }
    }
}
public class Array{
public static void main(String[] args) {
ArraysExample obj=new ArraysExample();
obj.demoArrays();
}
}
