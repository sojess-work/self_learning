import java.util.Scanner;

public class HcfAndLcm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hcf = 0,lcm=0;
        System.out.println("Enter the first number");
        int firstnumber = in.nextInt();
        System.out.println("Enter the second number");
        int secondnumber = in.nextInt();
        for(int i=1 ;i<firstnumber && i<secondnumber; i++){
            if(firstnumber%i == 0 && secondnumber%i == 0){
                hcf=i;
            }
        }

        System.out.println("HCF "+hcf);
        System.out.println("LCM "+(firstnumber*secondnumber)/hcf);
    }
}
