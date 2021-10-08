//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.


import java.util.Scanner;
public class InfiniteSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        while(in.hasNextInt()){
            sum+=in.nextInt();
        }
        System.out.println(sum);


    }
}
