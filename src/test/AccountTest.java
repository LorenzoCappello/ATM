package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import code.Buisness_logic.Euro;
import code.Database.Account;

public class AccountTest 
{
    private Account account;

    @Before
    public void setup()
    {
        account=new Account( 12345, 54321, new Euro(1000.0), new Euro(1200.0 ));
    }

    @Test
    public void testCredit() 
    {
        account.credit(new Euro(10));
        assertEquals(1210, account.getTotalBalance().getValore()/100);
        assertEquals(1000, account.getAvailableBalance().getValore()/100);
    }

    @Test
    public void testDebit() 
    {
        account.debit(new Euro(10));
        assertEquals(1190, account.getTotalBalance().getValore()/100);
        assertEquals(990, account.getAvailableBalance().getValore()/100);
    }

    @Test
    public void testGetAccountNumber() 
    {
        assertEquals(12345, account.getAccountNumber());
    }

    @Test
    public void testGetAvailableBalance() 
    {
        assertEquals(1000, account.getAvailableBalance().getValore()/100);
    }

    @Test
    public void testGetTotalBalance() 
    {
        assertEquals(1200, account.getTotalBalance().getValore()/100);
    }

    @Test
    public void testValidatePIN()
    {
        assertTrue(account.validatePIN(54321));
        assertFalse(account.validatePIN(12345));
    }
}
