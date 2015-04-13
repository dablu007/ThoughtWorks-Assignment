import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by dabluk on 13/04/15.
 */
public class PrintPrimeFactor {
    public static void main(String args[]){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> primefactors = new ArrayList<Integer>();
        try {
            // Number Whose prime factor is to be found
            int number = Integer.parseInt(input.readLine());

            // passing that number as an argument to primefactor class
            PrimeFactor primeFactor = new PrimeFactor(number);

            // Store all factor in a arraylist of integer
            primefactors = primeFactor.getPrimeFactors();

            //print the arraylist of prime factors

            for (int i = 0; i < primefactors.size() ; i++) {
                System.out.print(primefactors.get(i));
                System.out.print(" ");
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
