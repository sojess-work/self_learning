package functions;

import java.util.ArrayList;

public class Candies {
    public static void main(String[] args) {
        ArrayList<Boolean> list = new ArrayList<>();
        int[] candies = {2,3,5,1,3};
        int extraCandies=3;
        int maxCandies = maxCandies(candies);
        for(int num : candies){
            if(num+extraCandies>maxCandies){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        System.out.println(list);

    }
    public static int maxCandies(int[] candies){
        int maxCandies=0;
        for(int num :candies){
            if(num>maxCandies){
                maxCandies=num;
            }
        }
        return maxCandies;
    }
}
