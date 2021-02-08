import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeWithTickTest {
    TimeWithTick timeWithTick;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        timeWithTick= new TimeWithTick();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
    @Test
    void testThatSecondsCanBeSet(){
        timeWithTick.setSeconds(22);
        assertEquals(22,timeWithTick.getSeconds());
    }
    @Test
    void testThatMinutesCanBeSet(){
        timeWithTick.setMinutes(22);
        assertEquals(22,timeWithTick.getMinutes());
    }
    @Test
    void testThatHoursCanBeSet(){
        timeWithTick.setHour(22);
        assertEquals(22,timeWithTick.getHour());
    }
    @Test
    void testThatSecondsCanBeTicked(){
        timeWithTick.setSeconds(22);
        timeWithTick.tickSeconds();
        timeWithTick.tickSeconds();
        assertEquals(24,timeWithTick.getSeconds());
    }
    @Test
    void testThatSecondsAtSixtyIncrementsMinute(){
        timeWithTick.setSeconds(60);
        timeWithTick.tickSeconds();
        assertEquals(0,timeWithTick.getSeconds());
    }
    @Test
    void testThatMinutesCanBeIncremented(){
        timeWithTick.setMinutes(22);
        timeWithTick.incrementMinutes();
        assertEquals(23,timeWithTick.getMinutes());
    }
    @Test
    void testThatMinutesAtSixtyIncrementsHour(){
        timeWithTick.setMinutes(60);
        timeWithTick.incrementMinutes();
        assertEquals(0,timeWithTick.getMinutes());
        assertEquals(1,timeWithTick.getHour());
    }
    @Test
    void testThatHourAtSixtyMovesIntoTheNextDay(){
     timeWithTick.setHour(23);
     timeWithTick.incrementHour();
     assertEquals(24,timeWithTick.getHour());
     timeWithTick.incrementHour();
     assertEquals(0,timeWithTick.getHour());
    }
    @Test
    void testThatTimeCanBeGottenInTwelveHourFormat(){
        timeWithTick.setHour(23);
        assertEquals(11,timeWithTick.getHourInAmAndPm());

    }
}