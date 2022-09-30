package com;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class PallindromeTest {

     @Test
     public void testPallindrome() {
    	 Pallindrome number = new Pallindrome();
          
         assertEquals("Pallindrome", number.pallindromecheck(121));
         assertEquals("Not Pallindrome", number.pallindromecheck(122));
    
}
}








