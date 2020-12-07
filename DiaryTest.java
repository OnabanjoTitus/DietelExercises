import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testDiaryEntryIsSet(){
        Diary myBreakUpDiary = new Diary(15);
        int numberOfDiaryEntries = myBreakUpDiary.getNumberOfDiaryEntries();
        assertEquals(15,numberOfDiaryEntries);
    }
    @Test
    void testDiaryEntryIsNotNull(){
        Diary myBreakUpDiary = new Diary(15);
        Entry[] entries= myBreakUpDiary.getEntries();
        assertNotNull(entries);
    }
    @Test
    void testDiaryEntryCanBeEntered(){
//        Diary myBreakUpDiary=new Diary(5);
//        Entry entry= new Entry("My Break up Story");
//        entry.setEntryBody("It just happened");
//        myBreakUpDiary.addNewEntry(entry);
//        Entry[]assertionEntry =new Entry[5];
//        assertionEntry[0]=entry;
//        assertEquals(assertionEntry,myBreakUpDiary.getEntries());
//        Entry secondEntry= new Entry("My Break up Story");
//        secondEntry.setEntryBody("It just happened again");
//        myBreakUpDiary.addNewEntry(secondEntry);
//        assertionEntry[1]=secondEntry;
//        assertEquals(assertionEntry,myBreakUpDiary.getEntries());
        Diary myBreakUpDiary= new Diary(5);
        Entry entry= new Entry("My break up story");
        entry.setEntryBody("It just happened");
        myBreakUpDiary.addNewEntry(entry);
        Entry[]assertionEntry= new Entry[5];
        assertionEntry[0]=entry;
        assertEquals(entry, myBreakUpDiary.getEntries()[0]);

        Entry entrySecond= new Entry("My break up story");
        entrySecond.setEntryBody("It just happened sha");
        myBreakUpDiary.addNewEntry(entrySecond);
        assertionEntry[1]=entrySecond;
        assertEquals(entrySecond, myBreakUpDiary.getEntries()[1]);


        
    }


}