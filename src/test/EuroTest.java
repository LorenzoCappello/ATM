package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import code.Buisness_logic.Euro;

public class EuroTest
 {

    @Test
    public void testGetValore() 
    {
        Euro e=new Euro(20);
        assertEquals(20,e.getValore()/100);
    }

    @Test
    public void testMinoreDi() 
    {
        Euro e=new Euro(20);
        assertTrue(e.minoreDi(new Euro(30)));
    }

    @Test
    public void testSomma() 
    {
        Euro e=new Euro(20);
        assertEquals(20,e.getValore());
    }

    @Test
    public void testSottrai() 
    {
        Euro e=new Euro(20);
        assertEquals(20,e.getValore());
    }

    @Test
    public void testStampa() 
    {
        Euro e=new Euro(20);
        assertEquals(20,e.getValore());
    }

    @Test
    public void testUgualeA() 
    {
        Euro e=new Euro(20);
        assertEquals(20,e.getValore());
    }
}
