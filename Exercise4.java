package ChapterFourteen;

import java.util.Scanner;

// Comparing Portions of Strings
public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input1 = scanner.nextLine();
        System.out.print("Enter another string: ");
        String input2 = scanner.nextLine();

        if (input1.regionMatches(true, 0, input2, 0, 5))
            System.out.println(
                    "First 5 characters of input1 and input2 match with case ignored");
        else
            System.out.println("First 5 characters of input1 and input2 do not match");
    }
}
