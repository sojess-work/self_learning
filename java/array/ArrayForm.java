//  https://leetcode.com/problems/add-to-array-form-of-integer/



class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
     
        //converting the given array form to a number
        //calling the created function arrayToInt, adding it with k and storing it in the number variable
        int number= arrayToInt(num)+k;
        ArrayList<Integer> list = new ArrayList<>();
        
        //converting the number into an array form
        while(number!=0){
            list.add(number%10);
            number/=10;
        }
        
        //Since it is reversed we need to reverse it again
        int start=0,end=list.size()-1;
        while(start<end){
            int temp=0;
            temp=list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }

      return list;  
    }
    
    //function to convert array form into an integer
    public int arrayToInt(int[] array){
        int number=0;
        for(int digit : array){
            number=number*10+digit;
        }
        return number;
    }
}
