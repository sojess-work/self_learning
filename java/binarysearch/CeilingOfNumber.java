package binarysearch;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr ={2,3,4,9,14,16,18};
        int target  = 5, start=0,end=arr.length-1;
        int ans= celing(arr,target);
        System.out.println(ans);

    }
    static int celing(int[] arr,int target){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                return arr[mid];
            }
        }
       return arr[start];
    }
}
