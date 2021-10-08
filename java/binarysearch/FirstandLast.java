package binarysearch;

import java.util.Arrays;

public class FirstandLast {
    public static void main(String[] args) {
        int[] ans= {-1,-1};
        int[] nums = {1,2,3,5,7,7,7,7,8,10,12};
        int target=7;
        ans[0]= binarySearch(nums,target,true);
        if(ans[0]!=-1){
            ans[1]=binarySearch(nums,target,false);
        }
        System.out.println(Arrays.toString(ans));

    }

    public static int binarySearch(int[] arr,int target, boolean firstcheck){
        int ans= -1;
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>target ){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else {
                ans=mid;
                if(firstcheck){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return ans;
}}
