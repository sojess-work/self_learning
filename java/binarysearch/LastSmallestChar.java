package binarysearch;
public class LastSmallestChar {
    public static void main(String[] args) {
        char[] letters= {'c','f','j'};
        char target='c';
        int start=0,N=letters.length;
        int end=N-1;
        while(start<=end){
            int mid=(start + end)/2;
            if(target<letters[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        System.out.println(letters[start%N]);
    }
}
