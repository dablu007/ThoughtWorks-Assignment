import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by dabluk on 13/04/15.
 */
public class CheckIsoscelesTriangle {
    @Test
    public void checkTriangle(){
        ArrayList<String> isoscelesTriangleStars = new ArrayList<String>();
        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(3);
        isoscelesTriangleStars = isoscelesTriangle.getIsoscelesTriangle();
        assertEquals("  *",isoscelesTriangleStars.get(0));
        assertEquals(" ***",isoscelesTriangleStars.get(1));
        assertEquals("*****",isoscelesTriangleStars.get(2));
    }

}
