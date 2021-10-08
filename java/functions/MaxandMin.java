package functions;

import java.util.Scanner;

public class MaxandMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = input.nextInt();
        System.out.println("Enter second number");
        int b = input.nextInt();
        System.out.println("Enter third number");
        int c = input.nextInt();
        System.out.println("Max "+maximum(a,b,c));
        System.out.println("Min "+minimum(a,b,c));


    }
    public static int maximum(int a, int b, int c){
        int max=0;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        if(max>c){
            return max;
        }else{
            return c;
        }
    }
    public static int minimum(int a, int b, int c){
        int min=0;
        if(a<b){
            min=a;
        }else{
            min=b;
        }
        if(min<c){
            return min;
        }else{
            return c;
        }
    }
}
