import java.util.*;
public class Unionof2array {
    public  int Unionof2arrays(int arr1[],int arr2[]){

         int n1=arr1.length;
         int n2=arr2.length;
         HashSet<Integer> set=new HashSet<>();
         for(int i=0;i<n1;i++){
             set.add(arr1[i]);
         }
         for (int j=0;j<n2;j++){
             set.add(arr2[j]);
         }
       return set.size();

    }

    public static void main(String[] args) {
        int [] arr1={7,3,9};
        int [] arr2={6,3,9,2,9,4};

         Unionof2array a1=new Unionof2array();
        System.out.println(a1.Unionof2arrays(arr1,arr2));
    }
}
