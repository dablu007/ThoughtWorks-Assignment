import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
/**
 * Created by dabluk on 12/04/15.
 */
public class CheckAsterisk {
    @Test
    public void CheckPrint(){
        Asterisk Ast = new Asterisk();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> output = new ArrayList<String>();
        int num = 0;
//        try {
//           // num = Integer.parseInt(input.readLine());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        Ast.SetAsterisk(8);
        output = Ast.getStar();
        assertEquals("********",output.get(0));
    }

}
