import java.util.ArrayList;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int maxCandies=0;
       
        //finding the greatest amount of candies among kids 
        for(int num :candies){
            if(num>maxCandies){
                maxCandies=num;
            }
        }
        //adding the extra candies among each kids and finding if someone have more candies than maxCandies
        for(int num : candies){
            if(num+extraCandies>=maxCandies){
                list.add(true);
            }else{
                list.add(false);
            }
        }
      return list;  
    }
}
}
