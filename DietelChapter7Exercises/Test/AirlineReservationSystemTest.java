import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineReservationSystemTest {
    AirlineReservationSystem airlineReservationSystem;
    @BeforeEach
    void setUp() {
        airlineReservationSystem = new AirlineReservationSystem();
    }

    @AfterEach
    void tearDown() {
        airlineReservationSystem=null;
    }
    @Test
    void testThatAllSeatsAreEmptyOnCreation(){
        boolean [] array= {false,false,false,false,false,false,false,false,false,false};
        assertArrayEquals(array,airlineReservationSystem.getAllFlightSeats());
    }
    @Test
    void testThatFirstClassSeatsCanBeReserved(){
        airlineReservationSystem.reserveSeats(1);
        airlineReservationSystem.reserveSeats(1);
        airlineReservationSystem.reserveSeats(1);
        airlineReservationSystem.reserveSeats(1);
        airlineReservationSystem.reserveSeats(1);


        assertTrue(airlineReservationSystem.getAllFlightSeats()[1]);
    }
    @Test
    void testThatEconomyClassSeatsCanBeReserved(){
        airlineReservationSystem.reserveSeats(2);
        airlineReservationSystem.reserveSeats(2);
        airlineReservationSystem.reserveSeats(2);
        airlineReservationSystem.reserveSeats(2);
        airlineReservationSystem.reserveSeats(2);
      assertTrue(airlineReservationSystem.getAllFlightSeats()[9]);
    }
    @Test
    void testThatEconomyClassDisplaysErrorWhenItsOverBooked(){
        airlineReservationSystem.reserveSeats(2);
        airlineReservationSystem.reserveSeats(2);
        airlineReservationSystem.reserveSeats(2);
        airlineReservationSystem.reserveSeats(2);
        airlineReservationSystem.reserveSeats(2);
        airlineReservationSystem.reserveSeats(2);
    }
    @Test
    void testThatFirstClassDisplaysErrorWhenItsOverBooked(){
        airlineReservationSystem.reserveSeats(1);
        airlineReservationSystem.reserveSeats(1);
        airlineReservationSystem.reserveSeats(1);
        airlineReservationSystem.reserveSeats(1);
        airlineReservationSystem.reserveSeats(1);
        airlineReservationSystem.reserveSeats(1);

    }
    @Test
    void testThatAirplaneHasBeenFullyBooked(){
        airlineReservationSystem.reserveSeats(1);
        airlineReservationSystem.reserveSeats(1);
        airlineReservationSystem.reserveSeats(1);
        airlineReservationSystem.reserveSeats(1);
        airlineReservationSystem.reserveSeats(1);
        airlineReservationSystem.reserveSeats(2);
        airlineReservationSystem.reserveSeats(2);
        airlineReservationSystem.reserveSeats(2);
        airlineReservationSystem.reserveSeats(2);
        airlineReservationSystem.reserveSeats(2);
        airlineReservationSystem.reserveSeats(2);

    }
    @Test
    void testThatBookingsCanBeSwitchedWhenAClassHasBeenOverBooked(){
        airlineReservationSystem.reserveSeats(1);
        airlineReservationSystem.reserveSeats(1);
        airlineReservationSystem.reserveSeats(1);
        airlineReservationSystem.reserveSeats(1);
        airlineReservationSystem.reserveSeats(1);
        airlineReservationSystem.reserveSeats(1);
        airlineReservationSystem.reserveSeats(2);


    }
}