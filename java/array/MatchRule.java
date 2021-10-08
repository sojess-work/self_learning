package arrays;

import java.util.ArrayList;

public class MatchRule {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }

        list.get(0).add("computer");
        list.get(0).add("silver");
        list.get(0).add("lenovo");
        list.get(1).add("phone");
        list.get(1).add("blue");
        list.get(1).add("pixel");
        list.get(2).add("phone");
        list.get(2).add("gold");
        list.get(2).add("iphone");

        System.out.println(list.size());
        System.out.println(list.get(0).get(0).equals("blue"));
        int[][] image = new int[5][4];



    }
}
