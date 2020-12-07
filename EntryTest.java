import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {
Entry entry;
    @BeforeEach
    void setUp() {
    entry=new Entry("");
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatTheEntryHasADate(){
        entry= new Entry("My Title");
        entry.setEntryTitle("New Entry Title");
        assertEquals(entry.getEntryTitle(),"New Entry Title");
    }
    @Test
    void testDateOfEntryIsCreatedAfterConstruction(){
         Entry newEntry;
        newEntry= new Entry("New Entry Title");
        LocalDateTime entryDateAndTime= newEntry.getEnterDateAndTime();
        assertNotNull(entryDateAndTime);
         LocalDate entryDate= entryDateAndTime.toLocalDate();
        assertEquals(entryDate,LocalDate.now());
        System.out.println(entryDateAndTime.toString());

     }
     @Test
    void  testEntryBodyCanBeEdited(){

        Entry newEntry= new Entry ("New Entry");
        newEntry.setEntryBody("This is the entry body");
        String entryBody=newEntry.getEntryBody();
        assertEquals("This is the entry body", entryBody );
     }

    @Test
    void  testViewEntry(){
        Entry newEntry= new Entry ("My Breakup Story");
        newEntry.setEntryBody("It just happened");
        String preview = newEntry.viewEntry();
        String expected= ("Title:My Breakup Story"+"\n"+"Entry Date:"+LocalDate.now()+"\n"+"Entry Body:It just happened");
        assertEquals(expected,preview);
        preview=newEntry.toString();
        assertEquals(expected,preview);
    }



}