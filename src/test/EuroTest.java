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
    public void setup()
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
<<<<<<< HEAD
        Euro temp=euro.sottrai(euro);
        assertEquals(0,temp.getValore()/100);
=======
 
>>>>>>> parent of c04fec6 (aggiunti test testSottrai, testStampa, testUgualeA)
    }

    @Test
    public void testStampa() 
    {
<<<<<<< HEAD
        String temp=euro.stampa();
        assertEquals("20.0 euro", temp);
=======

>>>>>>> parent of c04fec6 (aggiunti test testSottrai, testStampa, testUgualeA)
    }

    @Test
    public void testUgualeA() 
    {
<<<<<<< HEAD
        assertTrue(euro.ugualeA(new Euro(20)));
        assertEquals(euro.ugualeA(new Euro(10)), false);
=======
  
>>>>>>> parent of c04fec6 (aggiunti test testSottrai, testStampa, testUgualeA)
    }
}
