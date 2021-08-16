package problem.level.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParenthesesTest {
    private ValidParentheses validParentheses;

    @Before
    public void init(){
        validParentheses = new ValidParentheses();
    }

    @Test
    public void givenValidAndInvalidInput_whenIsValidParenthesesInvoked_thenValidateOrderIsCorrect(){
        Assert.assertFalse(validParentheses.isValid("(foo visited{)}9[ :bars]at thesame day!"));
        Assert.assertTrue(validParentheses.isValid("(foo visited)9[ :bars]{at the}same day!"));
    }
}
