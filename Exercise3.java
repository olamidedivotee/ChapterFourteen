package ChapterFourteen;

import java.util.Scanner;

// Comparing Strings
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter another string: ");
        String string2 = scanner.nextLine();

        System.out.printf(
                "string1 comparedTo string2 is %d", string1.compareTo(string2));

        if (string1.equals(string2))
            System.out.printf("%nstring1 is equal to string2");
        else
            System.out.printf("%nstring1 is greater than or less than string2");
    }
}
