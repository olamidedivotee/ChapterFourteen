package ChapterFourteen;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence and press Enter");
        String s1 = scanner.nextLine();
        StringBuilder cruise = new StringBuilder(s1);

        String[] tokens = s1.split(" ");
        System.out.printf("%nThe number of letters entered: %d%ns1 when tokenized:%n",
                tokens.length);

        for (String token : tokens)
            System.out.println(token);

        cruise.reverse();
        System.out.printf("%nThe reversed version of s1 is: %s%n", cruise.toString());
    }
}
