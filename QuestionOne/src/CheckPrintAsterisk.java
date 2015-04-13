import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by dabluk on 10/04/15.
 */
public class CheckPrintAsterisk {

    @Test
    public void ShouldPrint(){
        PrintAsterisk printAsterisk = new PrintAsterisk();
        printAsterisk.SetStar();
        ArrayList<String> output = printAsterisk.getStar();
//        System.out.print(output);
        assertEquals("*",   output.get(0));
        assertEquals("**",  output.get(1));
        assertEquals("***", output.get(2));


    }



}
