package za.ac.cput;
//This is a test file for my GoodFilms class
//Dlamini M 219105359 - App Dev 3 2021 March
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GoodFilmsTest {

    public GoodFilms filmUno , filmDos;
    @BeforeEach
    void setUp()
    {
        filmUno = new GoodFilms();
        filmDos = new GoodFilms();
    }

    //1.Equality Test - Testing if my 2 film objects are equal (If objects are the same , test works , if not , test fails)
    @Test
    void equalityTest()
    {
        assertEquals(filmUno,filmDos);
    }

    //2.Object Identity - Testing if my 2 film objects are identical
    @Test
    void identityTest()
    {
      assertSame(filmUno , filmDos);
    }

    //3.Failing Test - Testing for any fails
    @Test
    void failingTest()
    {
    fail("Your test has failed , run again!");
    }

    //4.Timeout Test
    @Test
    @Timeout(4)
    void timeoutTest()
    {

    }

    //5.Disabling Test - This test only fails when run separately , run entire class
    @Test
    @Disabled
    void disablingTest()
    {
    fail("This test won't fail!");
    }


}