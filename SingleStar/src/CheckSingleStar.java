import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by dabluk on 13/04/15.
 */
public class CheckSingleStar {
    @Test
    public void CheckStar(){
        ArrayList<String> singlestar = new ArrayList<String>();
        SingleStar star = new SingleStar();
        singlestar = star.getSingleStar();
        assertEquals("*",singlestar.get(0));
    }

}
