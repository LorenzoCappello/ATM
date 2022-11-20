package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import code.Buisness_logic.Euro;

public class EuroTest
 {
    private Euro euro;

    @Before
    public void setup() //setup test
    {
        euro=new Euro(20);
    }

    @Test
    public void testGetValore() 
    {
        assertEquals(20,euro.getValore()/100);
    }

    @Test
    public void testMinoreDi() 
    {
        assertTrue(euro.minoreDi(new Euro(30)));
    }

    @Test
    public void testSomma() 
    {
        Euro temp=euro.somma(euro);
        assertEquals(40,temp.getValore()/100);
    }

    @Test
    public void testSottrai() 
    {
        Euro temp=euro.sottrai(euro);
        assertEquals(0,temp.getValore()/100);
    }

    @Test
    public void testStampa() 
    {
        String temp=euro.stampa();
        assertEquals("20.0 euro", temp);
    }

    @Test
    public void testUgualeA() 
    {
        assertTrue(euro.ugualeA(new Euro(20)));
        assertEquals(euro.ugualeA(new Euro(10)), false);
    }
}
