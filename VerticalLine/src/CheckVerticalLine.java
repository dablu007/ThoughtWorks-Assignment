import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by dabluk on 13/04/15.
 */
public class CheckVerticalLine {
    @Test
    public void checkVerticalLine(){
        ArrayList<String> verticalLineStars = new ArrayList<String>();
        VerticalLine verticalLine = new VerticalLine(3);
        verticalLineStars = verticalLine.getVerticalLineStars();
        assertEquals("*",verticalLineStars.get(0));
        assertEquals("*",verticalLineStars.get(1));
        assertEquals("*",verticalLineStars.get(2));
    }
}
