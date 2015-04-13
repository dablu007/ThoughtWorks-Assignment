import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by dabluk on 13/04/15.
 */
public class PrintFizzBuzz {
    public static void main(String args[]){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> fizzbuzzOutputs = new ArrayList<String>();
        try {
            //Taking input from the user for the range from 1 to length
            int length = Integer.parseInt(input.readLine());

            //Creating an object of the fizzbuzz class and passing the length as parameter
            FizzBuzz fizzBuzz = new FizzBuzz(length);

            fizzbuzzOutputs = fizzBuzz.getFizzbuzzOutput();
            for (int i = 0; i < fizzbuzzOutputs.size(); i++) {
                System.out.println(fizzbuzzOutputs.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
