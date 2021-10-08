package functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(factorial(n));

    }
    public static int factorial(int n){
        int fact=1,i=1;
        while(i<=n){
           fact*=i;
           i++;
        }
        return fact;
    }
}
