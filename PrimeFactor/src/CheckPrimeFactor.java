import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by dabluk on 13/04/15.
 */
public class CheckPrimeFactor {
    @Test
    public void checkPrime(){
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        PrimeFactor primeFactor = new PrimeFactor(30);
        primeFactors = primeFactor.getPrimeFactors();
        assertEquals("2" ,primeFactors.get(0).toString());
        assertEquals("3" ,primeFactors.get(1).toString());
        assertEquals("5" ,primeFactors.get(2).toString());
    }
}
