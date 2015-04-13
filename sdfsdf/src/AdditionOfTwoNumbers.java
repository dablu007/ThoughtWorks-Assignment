import org.junit.Test;

/**
 * Created by dabluk on 10/04/15.
 */
public class AdditionOfTwoNumbers {

    private final int firstNumber;
    private final int secondNumber;

    public AdditionOfTwoNumbers(int firstNumber, int secondNumber){

        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int getSum() {
        return firstNumber + secondNumber;
    }
}


