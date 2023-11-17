import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password1 = scan.nextLine();
        int length = password1.length();
        if (length > 6){
            System.out.println("Invalid");
        }
        else {
            System.out.println("good");
        }

    }
}