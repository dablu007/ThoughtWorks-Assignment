import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by dabluk on 13/04/15.
 */
public class PrintIsoscelesTriangle {
    public static void main(String args[]){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> isoscelesTriangleStars = new ArrayList<String>();
        try {
            int length = Integer.parseInt(input.readLine());
            IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(length);
            isoscelesTriangleStars = isoscelesTriangle.getIsoscelesTriangle();
            for (int  i = 0;  i < length;  i++) {
                System.out.println(isoscelesTriangleStars.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
