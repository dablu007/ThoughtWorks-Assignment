import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
/**
 * Created by dabluk on 12/04/15.
 */
public class CheckHorizontalLine {


    @Test
    public void Should_Be_Able_To_Create_A_New_Instance(){
        HorizontalLine horizontalLine = new HorizontalLine(4);
        horizontalLine.getStars();
    }

}
