package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;


import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    private Vehicle vehicle1;
    private Vehicle vehicle2;
    private Vehicle vehicle3;

    @BeforeEach
    void setUp() {
        vehicle1 = new Vehicle();
        vehicle2 = new Vehicle();
        vehicle3 = vehicle1;
    }

    @Test
    void testEquality(){
        assertEquals(vehicle1, vehicle2);
    }

    @Test
    void testIdentity(){
        assertSame(vehicle1, vehicle3);
    }

    @Test
    void failingTest(){
        fail("a failing test");
    }

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
      void testTimeout(){
    }

    @Test
    @Disabled("for demonstration purposes")
        void testToBeSkipped(){
            //not executed
    }
}
