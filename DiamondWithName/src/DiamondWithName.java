import java.util.ArrayList;

/**
 * Created by dabluk on 13/04/15.
 */
public class DiamondWithName {
    private ArrayList<String> diamonds;
    private int length;
    public DiamondWithName(int length){
        diamonds = new ArrayList<String>();
        this.length = length;
    }
    public ArrayList<String> getDiamondByLine() {
        int size = (2 * length) - 1;

        for (int i = 0; i < length; i++) {
            String star = new String();
            int starCount = (2 * i) + 1;
            int space = (size - starCount) / 2;
            if ( i == length -1){
                star = star.concat("Dablu");
                diamonds.add(star);
                continue;
            }
            for (int j = 0; j < space; j++)
                star = star.concat(" ");

            for (int k = 0; k < starCount; k++)
                star = star.concat("*");
            //    System.out.println(star);
            diamonds.add(star);
        }
        for ( int  i =  length-1; i >= 0 ; i--){
            String star = new String();
            int starCount = (2*i) - 1;
            int space = (size - starCount) / 2;
            for (int  j = 0; j < space; j++){
                star = star.concat(" ");
            }
            for ( int k = 0; k < starCount; k++){
                star = star.concat("*");
            }
            diamonds.add(star);
        }
        return diamonds;
    }
}
