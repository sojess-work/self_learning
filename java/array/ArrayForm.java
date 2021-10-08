package arrays;

import java.util.ArrayList;

public class ArrayForm {
    public static void main(String[] args) {
        int[] num={9,9,9,9,9,9,9,9,9};
        int k =1;
        int number= arrayToInt(num)+k;
        System.out.println(number);
        ArrayList<Integer> list = new ArrayList<>();
        while(number!=0){
            list.add(number%10);
            number/=10;
        }
        System.out.println(list);
        int start=0,end=list.size()-1;
        while(start<end){
            int temp=0;
            temp=list.get(start);
            list.set(start,list.get(end));
            list.set(end,temp);
            start++;
            end--;
        }
        System.out.println(list);

    }
    public static int arrayToInt(int[] array){
        int number=0;
        for(int digit : array){
            number=number*10+digit;
        }
        return number;
    }
}
