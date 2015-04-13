import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by dabluk on 13/04/15.
 */
public class PrintVerticalLine {
    public static void main(String args[]){
        //Taking Input from the User Using BUffered Reader
        BufferedReader input  = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> verticalLineStars = new ArrayList<String>();
        try {
            //Length of the vertical line of the star to be printed
            int length = Integer.parseInt(input.readLine());

            //creating the object of the Vertical line
            VerticalLine verticalLine = new VerticalLine(length);

            // Storing the stars pattern in the arraylist verticalLineStars
            verticalLineStars = verticalLine.getVerticalLineStars();

            //Printing the vertical line stars pattern
            for (int i = 0; i < length; i++) {
                System.out.println(verticalLineStars.get(i));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
