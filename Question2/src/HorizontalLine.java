import java.util.ArrayList;

/**
 * Created by dabluk on 12/04/15.
 */
public class HorizontalLine {
    private ArrayList<String> stars;
    private int length;

    public HorizontalLine(int length){
        this.length = length;
        stars = new ArrayList<String>();
    }

    public ArrayList<String> getStars() {
        String s = new String();
        for ( int i = 0; i < length ; i++) {
            s = s.concat("*");
        }
        stars.add(s);
        return stars;
    }

    public void SetAsterisk(int n){

    }
}


