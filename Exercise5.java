// Exercise5
package ChapterFourteen;

public class RandomSentences {
    private final String article;
    private final String noun;
    private final String verb;
    private final String preposition;

    public RandomSentences(String randomArticle, String randomNoun,
                           String randomVerb, String randomPreposition) {
        this.article = randomArticle;
        this.noun = randomNoun;
        this.verb = randomVerb;
        this.preposition = randomPreposition;
    }

    public String toString() {
        return
                article + " " + noun + " " + verb + " " +
                        preposition + " " + article + " " + noun + "\n";
    }
}
