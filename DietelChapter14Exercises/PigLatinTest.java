import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PigLatinTest {
    PigLatin pigLatin;

    @BeforeEach
    void setUp() {
        pigLatin= new PigLatin();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatWeCanEnterASentence(){
        String sentence="The day today";
        pigLatin.enterSentence(sentence);
        assertEquals("The day today",pigLatin.getSentence());
    }
    @Test
    void testThatWordsCanBeSplit(){
        String sentence="The day today";
        pigLatin.enterSentence(sentence);
        pigLatin.splitSentence();
        assertEquals("The",pigLatin.getSplitWord()[0]);

    }
    @Test
    void testThatEachWordCanBeConvertedToPigLatin(){
        String sentence="jump the computer";
        pigLatin.enterSentence(sentence);
        pigLatin.splitSentence();
        pigLatin.convertSentenceToPigLatin();
        pigLatin.printLatinWord();

    }
}