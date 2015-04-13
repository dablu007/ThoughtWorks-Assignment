import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by dabluk on 13/04/15.
 */
public class PrintDiamond {
    public static void main(String args[]){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> diamonds = new ArrayList<String>();
        try {
            // Taking input from the user
            int length = Integer.parseInt(input.readLine());

            // Creating the object of the diamond class
            Diamond printDiamond = new Diamond(length);

            // Storing the pattern in the array list
            diamonds = printDiamond.getDiamondByLine();
            for (int i = 0; i < diamonds.size() ; i++) {
                System.out.println(diamonds.get(i));
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
