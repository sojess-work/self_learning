package binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12};
        int target=5,ans=0;
        ans=binarySearch(arr,target);
        System.out.println(ans);

    }
    public static int binarySearch(int[] arr,int target){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>target ){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else {
                return mid;
            }
        }
        return 0;
    }
}
