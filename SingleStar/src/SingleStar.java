import java.util.ArrayList;

/**
 * Created by dabluk on 13/04/15.
 */
public class SingleStar {
    private ArrayList<String> singleStar;
    public SingleStar(){
        singleStar = new ArrayList<String>();
    }

    public ArrayList<String> getSingleStar() {
        singleStar.add("*");
        return singleStar;
    }
}
