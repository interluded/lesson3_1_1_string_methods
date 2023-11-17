import java.util.Scanner;
public class FistLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("put in word");
        String word = scan.nextLine();
        int length = word.length();
        char last_letter = word.charAt(length - 1);
        char first_letter = word.charAt(0);

        if (first_letter == last_letter){
            System.out.println("same");
        }
        else{
            System.out.println("diff");
        }
        }
    }
