import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by dabluk on 13/04/15.
 */
public class CheckRightTriangle {
    @Test
    public void checkTriangle(){
        ArrayList<String> rightTriangleStars = new ArrayList<String>();
        RightTriangle rightTriangle = new RightTriangle(3);
        rightTriangleStars = rightTriangle.getRightTriangleStars();
        assertEquals("*",rightTriangleStars.get(0));
        assertEquals("**",rightTriangleStars.get(1));
        assertEquals("***",rightTriangleStars.get(2));
    }

}
