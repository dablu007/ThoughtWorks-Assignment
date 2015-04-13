import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by dabluk on 13/04/15.
 */
public class PrintHorizontalLine {
    public static void main(String args[]){
        ArrayList<String> horizontalLine = new ArrayList<String>();
        BufferedReader input  = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Taking the input from the user
            int length = Integer.parseInt(input.readLine());

            // Creating the object of Horizontal Line and passing length as an argument
            HorizontalLine hLine = new HorizontalLine(length);

            //Storing the stars pattern in the Array list

            horizontalLine = hLine.getStars();

            //printing the horizontal line
            System.out.print(horizontalLine.get(0));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
