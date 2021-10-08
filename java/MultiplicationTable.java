import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = in.nextInt();
        System.out.println("Enter the start");
        int start = in.nextInt();
        System.out.println("Enter the end");
        int end = in.nextInt();
        for(int i = start; i<=end; i++){
            System.out.println(i + " x " + number + " = " + i*number);
        }



    }
}
