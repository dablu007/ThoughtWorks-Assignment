import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by dabluk on 13/04/15.
 */
public class PrintRightTriangle {
    public static void main(String args[]){
        ArrayList<String> rightTriangleStars = new ArrayList<String>();
        BufferedReader input  = new BufferedReader(new InputStreamReader(System.in));

        try {
            int length = Integer.parseInt(input.readLine());
            RightTriangle rightTriangle = new RightTriangle(length);
            rightTriangleStars = rightTriangle.getRightTriangleStars();
            for (int i = 0; i < length ; i++) {
                System.out.println(rightTriangleStars.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
