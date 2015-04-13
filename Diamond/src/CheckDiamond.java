import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by dabluk on 13/04/15.
 */
public class CheckDiamond {
    @Test
    public void check(){
        ArrayList<String> diamonds = new ArrayList<String>();
        Diamond checkDiamond = new Diamond(3);
        diamonds = checkDiamond.getDiamondByLine();
        assertEquals("  *",diamonds.get(0));
        assertEquals(" ***",diamonds.get(1));
        assertEquals("*****",diamonds.get(2));
        assertEquals(" ***",diamonds.get(3));
        assertEquals("  *",diamonds.get(4));
    }
}