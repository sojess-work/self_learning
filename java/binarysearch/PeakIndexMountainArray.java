package binarysearch;

public class PeakIndexMountainArray {
    public static void main(String[] args) {
           int[] arr ={1,3,5,7,9,11,10,8,6,4};
           int start =0;
           int end = arr.length-1;

           while(start<end){
               int mid=(start+end)/2;
               if(arr[mid]>arr[mid+1]){
                   end=mid;
               }else{
                   start=mid+1;
               }

           }
        System.out.println(start);
    }
}
