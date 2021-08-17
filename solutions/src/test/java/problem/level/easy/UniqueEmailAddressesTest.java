package problem.level.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UniqueEmailAddressesTest {
    private UniqueEmailAddresses uniqueEmailAddresses;

    @Before
    public void init(){
        uniqueEmailAddresses = new UniqueEmailAddresses();
    }

    @Test
    public void test(){
        final String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        final String[] emails2 = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        final String[] emails3 = {"test.emailleet@code.com","test.email@leetcode.com",};
        Assert.assertEquals(2, uniqueEmailAddresses.numUniqueEmails(emails));
        Assert.assertEquals(3, uniqueEmailAddresses.numUniqueEmails(emails2));
        Assert.assertEquals(2, uniqueEmailAddresses.numUniqueEmails(emails3));
    }
}
