import java.util.Scanner;
public class Password2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password1 = scan.nextLine();
        int length = password1.length();
        char first_letter = password1.charAt(0);
        boolean lowerCase = Character.isLowerCase(first_letter);
        if (length > 6 || !lowerCase){
            System.out.println("Valid");
        }
        else {
            System.out.println("false");
        }

    }
}