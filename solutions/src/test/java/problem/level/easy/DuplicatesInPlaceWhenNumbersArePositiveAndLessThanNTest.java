package problem.level.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DuplicatesInPlaceWhenNumbersArePositiveAndLessThanNTest {
    private FindDuplicatesIntegerInPlaceWhenNumbersArePositiveAndLessThanN duplicates;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void init(){
        duplicates = new FindDuplicatesIntegerInPlaceWhenNumbersArePositiveAndLessThanN();
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void givenPositiveIntegerLessThanNArray_whenFindDuplicatesInvoked_thenPrintDuplicatesInPlace(){
        System.setOut(new PrintStream(outputStreamCaptor));
        duplicates.findDuplicates(new int[]{1,2,3,2,4,5,6,5});
        Assert.assertEquals("2 5", outputStreamCaptor.toString()
                .trim());
    }
}
