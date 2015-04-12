import java.util.ArrayList;

/**
 * Created by dabluk on 10/04/15.
 */
public class PrintAsterisk {
    private ArrayList<String> Star;

    public ArrayList<String> getStar() {

        return Star;
    }
    public void SetStar(){
        //String s = new String();
    //    StringBuilder s = new StringBuilder();
        Star = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            String s = new String();
            for (int j = 0; j <= i ;j++ ) {
                s = s.concat("*");

            }
            Star.add(s);
        }
    }
}
