import java.util.ArrayList;

/**
 * Created by dabluk on 13/04/15.
 */
public class IsoscelesTriangle {
    private ArrayList<String> isoscelesTriangle;
    private int length;
    public IsoscelesTriangle(int length){
        isoscelesTriangle = new ArrayList<String>();
        this.length = length;
    }

    public ArrayList<String> getIsoscelesTriangle() {
        int size = (2 * length) - 1;

        for (int i = 0; i < length; i++) {
            String star = new String();
            int starCount = (2 * i) + 1;
            int space = (size - starCount) / 2;

            for (int j = 0; j < space; j++)
                star = star.concat(" ");

            for (int k = 0; k < starCount; k++)
                star = star.concat("*");
        //    System.out.println(star);
            isoscelesTriangle.add(star);
        }
        return isoscelesTriangle;
    }
}
