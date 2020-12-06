import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayClassWorkTest {
ArrayClassWork array;
    @BeforeEach
    void setUp() {
        array=new ArrayClassWork();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testForTheSumOfElementsInAnArray(){
        double [] scores = {2,2,2};
        assertEquals(6.0,array.calculateSum(scores));


    }
    @Test
    void testForTheAverageOfElementsInAnArray(){
        double [] scores = {3,6,1,3};
        assertEquals(3.25  ,array.calculateAverage(scores));


    }
    @Test
    void testForTheMaximumElementInAnArray(){
        int [] scores={1,2,3,4,6,1};
        assertEquals(6,array.getTheMaximumNumber(scores));

    }
    @Test
    void testForTheMinimumElementInAnArray(){
        int [] scores={1,2,3,4,6,1,-2};
        assertEquals(-2,array.getTheMinimumNumber(scores));

    }
    @Test
    void testForTheMaximumNumberOfWaysTheNumbersCanBeAdded(){
        int [] scores = {3,6,1,3};
        assertEquals(12,array.getMaximumNumberCombination(scores));
    }

    @Test
    void testForTheMinimumNumberOfWaysTheNumbersCanBeAdded(){
        int [] scores={3,6,1,3};
        assertEquals(7,array.getMinimumNumberCombination(scores));
    }
}