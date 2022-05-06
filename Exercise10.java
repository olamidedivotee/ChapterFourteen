package ChapterFourteen;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Sentence and press Enter");
        String s1 = scanner.nextLine();

        System.out.println();
        System.out.printf("s1 in uppercase: %s%n", s1.toUpperCase());
        System.out.printf("s1 in lowercase: %s%n", s1.toLowerCase());
    }
}
