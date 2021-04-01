package za.ac.cput;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Ameer Dollie (218336934)
 *
 * This is a test file for Game class
 * Date: 1 April 2021
 */
class GameTest {

    public Game game1, game2;

    @BeforeEach
    void setUp(){
        game1 = new Game();
        game2 = new Game();
    }

    //Equality test
    @Test
    void equalityTest(){assertEquals(game1, game2);}

    //Object Identity
    @Test
    void identityTest(){assertSame(game1, game2);}

    //Failing Test
    @Test
    void failingTest(){fail("Failed test, run again!!");}

    //Timeout Test
    @Test
    @Timeout(4)
    void timeoutTest(){}

    //Disabling test
    @Test
    @Disabled
    void disablingTest(){fail("This test wont fail!");}
}
