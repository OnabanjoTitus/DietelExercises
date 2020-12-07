import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }
   @Test
    void testToEnsureItTakesInNames(){
        User name= new User();
        name.setFirstName("Titus");
        name.setLastName("Dam");
        assertEquals("Titus",name.getFirstName());
        assertEquals("Dam",name.getLastName());
}

}
