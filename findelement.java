
public class BinarySearchfinal {
    public static int findelement(int[]arr,int target){
        int l=0;
        int e=arr.length-1;
        while(l<=e){
            int mid=l+(e-l)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                e=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
