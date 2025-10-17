import java.util.*;


public class Intersectionof2array {
 public static int intersectionofarray(int arr1[],int arr2[]){
     int n1=arr1.length;
     int n2=arr2.length;
     HashSet<Integer> set=new HashSet<>();
     for(int i=0;i<n1;i++){
         set.add(arr1[i]);
     }
     System.out.println("new set of arr1 is :"+set);
     int n3=set.size();
     int count=0;

//     ab yaha se traverse kiya aur compare kiye element hai ki nahi
     for(int i=0;i<n3;i++)
     {
         for (int j=0;j<n2;j++)
         {
//               👇 ye check karega ki hamre set me arr2[j] ka element hai
           if (set.contains(arr2[j]))
           {
               count++;
               set.remove(arr2[j]);
           }
         }
     }

     return count;

 }

    public static void main(String[] args) {
        int [] arr1={7,3,9};
        int [] arr2={6,3,9,2,9,4};
        System.out.println(intersectionofarray(arr1,arr2));
    }
}
