package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import code.Buisness_logic.Euro;

public class EuroTest
 {
    private Euro e;

    @Before
    public void setup()
    {
        e=new Euro(20);
    }

    @Test
    public void testGetValore() 
    {
        assertEquals(20,e.getValore()/100);
    }

    @Test
    public void testMinoreDi() 
    {
        assertTrue(e.minoreDi(new Euro(30)));
    }

    @Test
    public void testSomma() 
    {
        Euro temp=e.somma(e);
        assertEquals(40,temp.getValore()/100);
    }

    @Test
    public void testSottrai() 
    {
        Euro temp=e.sottrai(e);
        assertEquals(0,temp.getValore()/100);
    }

    @Test
    public void testStampa() 
    {
        String temp=e.stampa();
        assertEquals("20.0 euro", temp);
    }

    @Test
    public void testUgualeA() 
    {
        assertTrue(e.ugualeA(new Euro(20)));
        assertEquals(e.ugualeA(new Euro(10)), false);
    }
}
