import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisplayingATextWithItsWordsReversedTest {
    DisplayingATextWithItsWordsReversed displayingATextWithItsWordsReversed;
    String sentence="Today is the day";
    @BeforeEach
    void setUp() {
        displayingATextWithItsWordsReversed= new DisplayingATextWithItsWordsReversed();

    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatWeCanEnterASentence(){
    displayingATextWithItsWordsReversed.enterSentence(sentence);

    assertEquals(sentence,displayingATextWithItsWordsReversed.getSentence());

    }
    @Test
    void testThatTheWordIsOfTheSameLength(){
        displayingATextWithItsWordsReversed.enterSentence(sentence);
        assertEquals(sentence.length(),displayingATextWithItsWordsReversed.getSentence().length());
    }
    @Test
    void testThatWordsCanBeSplit(){
        displayingATextWithItsWordsReversed.enterSentence(sentence);
        displayingATextWithItsWordsReversed.splitWords();
        assertEquals("Today",displayingATextWithItsWordsReversed.getWord()[0]);
    }
    @Test
    void testThatEachSplitWordCanBeReversed(){
        displayingATextWithItsWordsReversed.enterSentence(sentence);
        displayingATextWithItsWordsReversed.splitWords();
        displayingATextWithItsWordsReversed.reverseWords();
        assertEquals("yadoT",displayingATextWithItsWordsReversed.getWord()[0]);
    }
    @Test
    void testThatWeCanReverseAWord(){
        displayingATextWithItsWordsReversed.enterSentence("1234");
        displayingATextWithItsWordsReversed.splitWords();
        displayingATextWithItsWordsReversed.reverseWords();
        assertEquals("4321",displayingATextWithItsWordsReversed.getWord()[0]);

    }
    @Test
    void testThatExceptionIsThrownForANullString(){

        assertThrows(DisplayingATextWithItsWordsReversed.NullCannotBeReversedException.class,()-> displayingATextWithItsWordsReversed.enterSentence(null));
    }
}