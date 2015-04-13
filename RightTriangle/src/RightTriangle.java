import java.util.ArrayList;

/**
 * Created by dabluk on 13/04/15.
 */
public class RightTriangle {
    private ArrayList<String> rightTriangleStars;
    private int length;

    public RightTriangle(int length){
        this.length = length;
        rightTriangleStars = new ArrayList<String>();
    }
    public ArrayList<String> getRightTriangleStars() {
        for (int i = 0; i < length; i++) {
            String star = new String();
            for (int j = 0; j <= i ; j++) {
                star = star.concat("*");
            }
            rightTriangleStars.add(star);
        }
        return rightTriangleStars;
    }
}
