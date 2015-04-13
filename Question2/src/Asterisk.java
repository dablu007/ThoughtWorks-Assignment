import java.util.ArrayList;

/**
 * Created by dabluk on 12/04/15.
 */
public class Asterisk {
    private ArrayList<String> Star;
    public Asterisk(){


    }

    public ArrayList<String> getStar() {

        return Star;
    }
    public void SetAsterisk(int n){
        Star = new ArrayList<String>();
        String s = new String();
        for ( int i = 0; i < n ; i++)
        s = s.concat("*");
        Star.add(s);
    }
}
