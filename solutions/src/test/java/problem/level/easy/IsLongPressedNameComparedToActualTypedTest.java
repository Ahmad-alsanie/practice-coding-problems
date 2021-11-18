package problem.level.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import problem.level.medium.IsLongPressedNameComparedToActualTyped;

public class IsLongPressedNameComparedToActualTypedTest {
    private IsLongPressedNameComparedToActualTyped longPressed;

    @Before
    public void init(){
        longPressed = new IsLongPressedNameComparedToActualTyped();
    }

    @Test
    public void givenActualNameAndLongPressedTypedName_whenLongPressedInvoked_thenReturnIfItsAPossibleLongPressedName(){
        Assert.assertTrue(longPressed.isLongPressedName("alex", "aaleex"));
        Assert.assertFalse(longPressed.isLongPressedName("saeed","ssaaedd"));
        Assert.assertFalse(longPressed.isLongPressedName("alex","aaleexa"));
    }
}
