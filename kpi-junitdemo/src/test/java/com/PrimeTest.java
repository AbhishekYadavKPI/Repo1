package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeTest {
     @Test
     public void testPrime() {
    	 Prime number = new Prime ();
          
         assertEquals("Prime", number.primecheck(7));
    
}
}




