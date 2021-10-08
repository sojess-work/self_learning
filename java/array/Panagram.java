package arrays;

public class Panagram {
    public static void main(String[] args) {
        String sentance = "thequickbrownfoxjumpsoverthelazydog";
        for(char ch = 'a';ch<='z';ch++){
            if (sentance.indexOf(ch)<0){
                System.out.println("False");
                break;
            }
        }
        System.out.println("true");
    }
}
