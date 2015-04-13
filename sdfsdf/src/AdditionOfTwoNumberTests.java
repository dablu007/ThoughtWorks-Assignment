import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionOfTwoNumberTests{

    @Test
    public void ShouldAddTwoNumbers(){
        AdditionOfTwoNumbers additionOfTwoNumbers = new AdditionOfTwoNumbers(10, 20);
        assertEquals(30, additionOfTwoNumbers.getSum());
    }
}
