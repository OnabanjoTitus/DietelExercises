import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefiningYourOwnStringTest {
    DefiningYourOwnString definingYourOwnString;
    @BeforeEach
    void setUp() {
        definingYourOwnString= new DefiningYourOwnString();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatWeCanInputAString(){
        definingYourOwnString.setString("Man");
        assertEquals("Man",definingYourOwnString.getString());
    }
    @Test
    void testThatWeCanGetTheIndexOfAString(){
        definingYourOwnString.setString("Mana");
        assertEquals(0,definingYourOwnString.getIndexOfString("M"));
        assertEquals(1,definingYourOwnString.getIndexOfString("a"));
        assertEquals(2,definingYourOwnString.getIndexOfString("n"));
    }
    @Test
    void testThatWeCanGetTheLastIndexOfAString(){
        definingYourOwnString.setString("Mana");
        assertEquals(3,definingYourOwnString.getTheLastIndexOfString("a"));
        definingYourOwnString.setString("Madam");
        assertEquals(4,definingYourOwnString.getTheLastIndexOfString("m"));
    }
    @Test
    void testThatExceptionsAreThrownForTheIndexOfANull(){
        assertThrows(DefiningYourOwnString.NoIndexForNull.class,()->definingYourOwnString.getIndexOfString(null));
        assertThrows(DefiningYourOwnString.NoIndexForNull.class,()->definingYourOwnString.getTheLastIndexOfString(null));
    }
}