import java.util.Scanner;

public class CorrespondingCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a letter
        System.out.print("Enter a letter: ");
        String inputLetter = scanner.next().toLowerCase();

        // Calculate the corresponding letter in reverse alphabetical order
        char outputLetter = (char) ('a' + ('z' - inputLetter.charAt(0)));

        System.out.printf("The corresponding letter is %c", outputLetter);
    }
}
