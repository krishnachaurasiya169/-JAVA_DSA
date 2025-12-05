package array;

public class maxelement {
    public static void main(String[] args) {
        int [] arr={33,14,35,6,194};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,0 ,3));
    }
    static int maxRange(int[] arr,int start,int end){
        int maxval=arr[start];
        for(int i=start;i<=end;i++){
            if(maxval < arr[i]){
                maxval=arr[i];
            }
        }
        return maxval;
    }


    static int max(int[] arr){
        int maxval=arr[0];
        for(int i=0;i<arr.length;i++){
            if(maxval < arr[i]){
                maxval=arr[i];
            }
        }
        return maxval;
    }
}
