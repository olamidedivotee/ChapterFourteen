//Exercise5
package ChapterFourteen;

public class SentenceTest {
    public static void main(String[] args) {
        Sentences sentences = new Sentences();
        sentences.MixUp();

        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-11s", sentences.workSentenceUp());

            if (i % 1 == 0)
                System.out.println();
        }
    }
}
