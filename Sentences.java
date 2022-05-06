// Exercise5
package ChapterFourteen;

import java.security.SecureRandom;

public class Sentences {
    private final RandomSentences[] lines;
    private int currentSentence;
    private static final int NUMBER_OF_SENTENCE = 20;
    private static final SecureRandom randomNum = new SecureRandom();

    public Sentences() {
        String[] article = { "the", "a", "one", "some", "any" };
        String[] noun = { "boy", "girl", "dog", "town", "car" };
        String[] verb = { "drove", "jumped", "ran", "walked", "skipped" };
        String[] preposition = { "to", "from", "over", "under", "on" };

        lines = new RandomSentences[NUMBER_OF_SENTENCE];
        currentSentence = 0;

        for (int count = 0; count < lines.length; count++)
            lines[count] =
                    new RandomSentences(article[count % 5], noun[count % 5],
                            verb[count / 5], preposition[count / 5]);
    }

    public void MixUp() {
        currentSentence = 0;

        for (int first = 0; first < lines.length; first++) {
            int second = randomNum.nextInt(NUMBER_OF_SENTENCE);

            RandomSentences temp = lines[first];
            lines[first] = lines[second];
            lines[second] = temp;
        }
    }

    public RandomSentences workSentenceUp() {
        if (currentSentence < lines.length)
            return lines[currentSentence++];
        return null;
    }
}
