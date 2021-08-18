package problem.level.easy;

import java.util.Arrays;

public class KeyFormattingIntoEqualGroups {

    /**
     * @Description
     * You are given a license key represented as a string s that consists of only alphanumeric characters and dashes.
     * The string is separated into n + 1 groups by n dashes. You are also given an integer k.
     *
     * We want to reformat the string s such that each group contains exactly k characters, except for the first group,
     * which could be shorter than k but still must contain at least one character.
     * Furthermore, there must be a dash inserted between two groups, and you should convert all lowercase letters to uppercase.
     *
     * Return the reformatted license key.
     * */

    /**
     * @Example
     * Input: s = "5F3Z-2e-9-w", k = 4
     * Output: "5F3Z-2E9W"
     *
     * Input: s = "2-5g-3-J", k = 2
     * Output: "2-5G-3J"
     */
    public String licenseKeyFormatting(String s, int k) {
        final StringBuilder sb = new StringBuilder(s.replaceAll("-","").toUpperCase());
        int groups = sb.length()%k == 0 ? sb.length()/k: sb.length()/k+1;
        int whereToInsert = sb.length() -k;
        for(int i = groups; i >= 0; i--){
            if (whereToInsert > 0) {
                sb.insert(whereToInsert, "-");
            }
            whereToInsert -=k;
        }
        return sb.toString();
    }
}
