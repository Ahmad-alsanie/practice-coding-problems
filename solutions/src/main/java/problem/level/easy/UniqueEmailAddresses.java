package problem.level.easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

    /**
     * @Description
     * Every valid email consists of a local name and a domain name, separated by the '@' sign. Besides lowercase letters, the email may contain one or more '.' or '+'.
     *
     * For example, in "alice@leetcode.com", "alice" is the local name, and "leetcode.com" is the domain name.
     * If you add periods '.' between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name. Note that this rule does not apply to domain names.
     *
     * For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.
     * If you add a plus '+' in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered. Note that this rule does not apply to domain names.
     *
     * For example, "m.y+name@email.com" will be forwarded to "my@email.com".
     * It is possible to use both of these rules at the same time.
     *
     * Given an array of strings emails where we send one email to each email[i], return the number of different addresses that actually receive mails.
     */

    /**
     * @Example
     * Input: emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com",
     * "testemail+david@lee.tcode.com"]
     * Output: 2
     * */


    public int numUniqueEmails(String[] emails) {
        final Set<String> seenMail = new HashSet<>();
        for(String email: emails){
            String[] cobination = email.split("@");
            if(cobination.length == 2){
                String localName = cobination[0];
                if(localName.contains("+")){
                    localName = localName.substring(0,localName.indexOf('+'));
                }
                localName = localName.replaceAll("\\.","");
                seenMail.add(localName + "@" + cobination[1]);
            }
        }
        return seenMail.size();
    }
}
