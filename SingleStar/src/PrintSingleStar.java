import java.util.ArrayList;

/**
 * Created by dabluk on 13/04/15.
 */
public class PrintSingleStar {
    public static void main(String args[]){
        SingleStar printSingleStar = new SingleStar();
        ArrayList<String> printStar = new ArrayList<String>();
        printStar = printSingleStar.getSingleStar();
        System.out.println(printStar.get(0));
    }
}
