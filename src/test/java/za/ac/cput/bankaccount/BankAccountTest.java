/**
 * BankAccountTest.java
 * This is a test class for BankAccount
 * @author Christopher Doolings (218338376)
 * Date: 1 April 2021
 */

package za.ac.cput.bankaccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    private BankAccount account1, account2;

    @BeforeEach
    void setUp() {
        account1 = new BankAccount();
        account2 = new BankAccount();
    }

    //This test checks if objects are equal.
    @Test
    void testEquality() {
        account1.setBalance(200);
        assertEquals(200, account1.getBalance());
    }

    //This test checks if two objects are similar.
    @Test
    void testIdentity() {
        account1.setAccHolder("Mike Hawk");
        assertSame("Alpha Kenny", account1.getAccHolder());
    }

    //This test will deliberately fail.
    @Test
    void testFail() {
        fail("This test was coded to deliberately fail.");
        account2.setBalance(100);
        account2.deposit(300);
    }

    //This test will timeout after 2 seconds and the code below it will not execute.
    @Test
    @Timeout(2)
    void testTimeout() throws InterruptedException{
        Thread.sleep(2000);
        if(account2.withdraw(20) == true) {
            System.out.println("Withdrawal for R20 is successful");
        } else {
            System.out.println("Insufficient funds");
        }
    }

    //This test will be ignored
    @Test
    @Disabled
    void testDisable() {
        account1.show();
        account2.show();
    }
}