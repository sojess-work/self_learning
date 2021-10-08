import java.util.Scanner;

public class SubProSum {
    public static void main(String[] args) {
        int sum=0, product=1;
        Scanner input= new Scanner(System.in);
        int number= input.nextInt();
        while(number>0){
            int digit=number%10;
            sum+=digit;
            product*=digit;
            number/=10;
        }
        System.out.println(product-sum);
    }
}
