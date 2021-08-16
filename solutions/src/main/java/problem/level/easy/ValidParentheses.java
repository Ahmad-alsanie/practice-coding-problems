package problem.level.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {

    /**
     * @Description
     * Given a string word containing any characters with parentheses '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * An input string is valid if:
     *
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * */

    /**
     * Example:
     *  input: "(foo visited)9[ :bars]{at the}same day!"
     *  output: true
     *
     *  input: "(foo visited{)}9[ :bars]at thesame day!"
     *  output: false
     *  { has the wrong closing ) before }
     * */

    public boolean isValid(String word) {
        final Map<Character,Character> validOrder = new HashMap<>();
        validOrder.put('}','{');
        validOrder.put(')','(');
        validOrder.put(']','[');
        Deque<Character> stack = new ArrayDeque<>();
        final String parentheses = word.replaceAll("[^*\\(|\\)|\\{|\\}|\\]|\\[*]", "");
        for(char c : parentheses.toCharArray()){
            if(validOrder.containsKey(c)){
                //Handles noSuchElementException
                Character currentClosingChar = stack.isEmpty()? '$': stack.pop();
                //is the right closing parentheses ?
                if(validOrder.get(c) != currentClosingChar){
                    return false;
                }
            }else{
                //push all none matching closing or any for that matter since we will pop any
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
