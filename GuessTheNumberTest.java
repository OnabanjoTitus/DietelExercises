import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testForRandomValuesEquals(){
      GuessTheNumber number = new GuessTheNumber();
      number.setNumber(0);
      assertEquals(0,number.getRandomNumber());
    }
    @Test
    void testForRandomValuesGreater(){
        GuessTheNumber number = new GuessTheNumber();
        number.setRandomNumberGreater(22);
        assertEquals(22,number.getRandomNumberGreater());
    }
    @Test
    void testForRandomValuesLess(){
        GuessTheNumber number = new GuessTheNumber();
        number.setRandomNumberSmaller(-9);
        assertEquals(-9, number.getRandomNumberSmaller());
    }
}