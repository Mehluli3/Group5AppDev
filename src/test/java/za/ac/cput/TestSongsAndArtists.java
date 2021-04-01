package za.ac.cput;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/*
   Name: Damian Du Toit
   Student Number: 219200203
   Year: 3
   Subject: App Dev 3
   IDE: IntelliJ
   Project Type: Apache Maven
 */

public class TestSongsAndArtists
{
    private SongsAndArtists song1, song2;

    @BeforeEach
    void setUp()
    {
        song1 = new SongsAndArtists();
        song2 = new SongsAndArtists();
    }

    //Here's a test for equality
    @Test
    void testForEquality()
    {
        assertEquals(song1, song2);
    }

    //Here's a test for identity
    @Test
    void testForIdentity()
    {
        assertSame(song1, song2);
    }

    //Here's a test for failure
    @Test
    void testForFailure()
    {
        fail("This test has failed, please fix the problem and run the test again");
    }

    //Here's a test for timeouts
    @Test
    @Timeout(10)
    void testForTimeouts()
    {

    }

    //Here's a disabled test
    @Test
    void disabledTest()
    {
        fail("If you're reading this, then it means the test you've run has failed!");
    }
}
