import java.util.ArrayList;

/**
 * Created by dabluk on 13/04/15.
 */
public class VerticalLine {
    private ArrayList<String> verticalLineStars;
    private int length;
    public VerticalLine(int length){
        verticalLineStars = new ArrayList<String>();
        this.length = length;
    }

    public ArrayList<String> getVerticalLineStars() {

        for (int i = 0; i < length; i++) {
            String verticalLineStar = new String();
            verticalLineStar = verticalLineStar.concat("*");
            verticalLineStars.add(verticalLineStar);
        }

        return verticalLineStars;
    }
}
