import java.util.*;
public class SubArraySum {
public static int subarraysum(int arr[],int k){
    int n=arr.length;
    int ans=0;
    for(int i=0;i<n;i++){
        int sum=0;
        for(int j=i;j<n;j++){
            sum+=arr[j];
            if(sum==k){
                ans++;
            }
        }
    }
    return ans;
}
    public static void main(String[] args)
    {
        int[]arr={1,2,3};
        int k=3;
        System.out.println(subarraysum(arr,k));
    }
}
