import java.util.ArrayList;

/**
 * Created by dabluk on 13/04/15.
 */
public class FizzBuzz {
    private ArrayList<String> fizzbuzzOutputs;
    private int length;
    public FizzBuzz(int length){
        fizzbuzzOutputs = new ArrayList<String>();
        this.length = length;

    }
    public ArrayList<String> getFizzbuzzOutput() {
        for (int i = 1; i <= length; i++) {
            String fizzbuzzOutputOfNumber = new String();
            if ( i % 3 == 0 && i % 5 == 0){
                fizzbuzzOutputOfNumber = fizzbuzzOutputOfNumber.concat("FizzBuzz");
            }
            else if ( i % 3 == 0){
                fizzbuzzOutputOfNumber = fizzbuzzOutputOfNumber.concat("Fizz");
            }
            else if ( i % 5 == 0){
                fizzbuzzOutputOfNumber = fizzbuzzOutputOfNumber.concat("Buzz");
            }
            else {

                fizzbuzzOutputOfNumber = fizzbuzzOutputOfNumber.concat(Integer.toString(i));
            }
            fizzbuzzOutputs.add(fizzbuzzOutputOfNumber);
        }
        return fizzbuzzOutputs;
    }
}
