import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrintArrayTest {
PrintArray printArray;
    @BeforeEach
    void setUp() {
        printArray= new PrintArray();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatWeCanPrintArray(){
        Integer[]integerArray={1,2,2,4,5,9,2,1,22};
        int[]intArray={1,2,2,4,5,9,2,1,22};
        int start=3;
        int stop=5;

        printArray.printingArray(integerArray,start,stop);
        printArray.printingArray(intArray, start, stop);
    }
    @Test
    void testThatItThrowsAnInvalidSubscriptException(){
        Integer[]integerArray={1,2,2,4,5,9,2,1,22};
        int[]intArray={1,2,2,4,5,9,2,1,22};
        int start=3;
        int stop=15;
        assertThrows(PrintArray.InvalidSubScriptException.class,()-> printArray.printingArray(integerArray,start,stop));
        assertThrows(PrintArray.InvalidSubScriptException.class,()-> printArray.printingArray(intArray, start, stop));

    }
}