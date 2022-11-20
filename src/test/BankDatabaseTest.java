package test;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;

import code.Buisness_logic.Euro;
import code.Database.BankDatabase;

public class BankDatabaseTest {

    private BankDatabase db;
    
    @Before
    public void setup(){
        db = new BankDatabase();
        // accounts[ 0 ] = new Account( 12345, 54321, new Euro(1000.0), new Euro(1200.0 ));
        // accounts[ 1 ] = new Account( 98765, 56789, new Euro(200.0), new Euro(200.0));  
    }

    @Test
    public void testAuthenticateUser() {
        assertTrue(db.authenticateUser(12345, 54321));
        assertFalse(db.authenticateUser(11111, 11111));
    }

    @Test
    public void testCredit() {
       //assertTrue() -> account contiene x soldi
       Euro e = new Euro(1200);
       assertTrue(e.ugualeA(db.getTotalBalance(12345)));
       // credit()
       db.credit(12345, new Euro(200));
       //assertTrue() -> account contiene y soldi
       assertTrue(e.somma(new Euro(200)).ugualeA(db.getTotalBalance(12345)));
    }

    @Test
    public void testDebit() {
        Euro e = new Euro(1200);
        assertTrue(e.ugualeA(db.getTotalBalance(12345)));
        db.debit(12345,new Euro(200));
        assertTrue(e.sottrai(new Euro(200)).ugualeA(db.getTotalBalance(12345)));
        assertTrue(e.sottrai(new Euro(200)).ugualeA(db.getAvailableBalance(12345)));
    }

    @Test
    public void testGetAvailableBalance() {
        Euro e = new Euro(1000);
        assertTrue(e.ugualeA( db.getAvailableBalance(12345)));
    }

    @Test
    public void testGetTotalBalance() {
        Euro e = new Euro(1200);
        assertTrue(e.ugualeA( db.getTotalBalance(12345)));
    }
}
