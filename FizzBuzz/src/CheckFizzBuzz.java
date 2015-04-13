import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by dabluk on 13/04/15.
 */
public class CheckFizzBuzz {
    @Test
    public void checkFizzbuzz(){
        ArrayList<String> fizzbuzzOutputs = new ArrayList<String>();
        FizzBuzz fizzBuzz = new FizzBuzz(5);
        fizzbuzzOutputs = fizzBuzz.getFizzbuzzOutput();
        assertEquals("1", fizzbuzzOutputs.get(0));
        assertEquals("2", fizzbuzzOutputs.get(1));
        assertEquals("Fizz", fizzbuzzOutputs.get(2));
        assertEquals("4", fizzbuzzOutputs.get(3));
        assertEquals("Buzz", fizzbuzzOutputs.get(4));
    }
}
