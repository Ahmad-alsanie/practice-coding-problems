package problem.level.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class KeyFormattingIntoEqualGroupsTest {
    private KeyFormattingIntoEqualGroups groups;

    @Before
    public void init(){
        groups = new KeyFormattingIntoEqualGroups();
    }

    @Test
    public void givenStringAndNumberOfCharsAllowed_whenLicenseKeyFormattingInvoked_ReturnFormattedString(){
        Assert.assertEquals("5F3Z-2E9W", groups.licenseKeyFormatting("5F3Z-2e-9-w", 4));
        Assert.assertEquals("2-5G-3J", groups.licenseKeyFormatting("2-5g-3-J", 2));
    }
}
