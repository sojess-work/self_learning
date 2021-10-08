import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter last number");
        int end = input.nextInt();
        int prev=0;
        int next=1;
        System.out.println(prev);
        while(next<end){
            int temp=prev+next;
            System.out.println(temp);
            prev=next;
            next=temp;


        }
    }
}
