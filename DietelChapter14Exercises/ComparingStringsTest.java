import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComparingStringsTest {
    ComparingStrings comparingStrings;

    @BeforeEach
    void setUp() {
        comparingStrings= new ComparingStrings();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testForStringEntries(){
        comparingStrings.setFirstString("ATE");
        comparingStrings.setSecondString("Night");
        assertEquals("ATE",comparingStrings.getFirstString());
        assertEquals("Night",comparingStrings.getSecondString());
    }
    @Test
    void testForComparison(){
        comparingStrings.setFirstString("ATE");
        comparingStrings.setSecondString("Night");
        comparingStrings.compareFirstStringToSecondString();
        assertEquals(-13,comparingStrings.getComparison());
        

    }
}