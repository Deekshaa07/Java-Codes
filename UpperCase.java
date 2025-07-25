import java.util.Scanner;

public class UpperCase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;

        System.out.println("Uppercase letters are: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                System.out.print(ch + " ");
                count++;
            }
        }

        System.out.println("\nTotal uppercase letters: " + count);
        sc.close();
    }
}
