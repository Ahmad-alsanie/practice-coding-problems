package problem.level.medium;

public class IsLongPressedNameComparedToActualTyped {


    /**
     * @Description
     * Your friend is typing his name into a keyboard. Sometimes, when typing a character c,
     * the key might get long pressed, and the character will be typed 1 or more times.
     *
     * You examine the typed characters of the keyboard.
     * Return True if it is possible that it was your friends name,
     * with some characters (possibly none) being long pressed.
     * */

    /**
     * @Example
     * Input: name = "alex", typed = "aaleex"
     * Output: true
     *
     * Input: name = "saeed", typed = "ssaaedd"
     * Output: false
     *
     * Input: name = "alex", typed = "aaleexa"
     * Output: false
     * */

    /**
     * @Hint
     * -The question is to check whether we can get name
     * string from typed string including some duplicate characters in the typed string.
     *
     * - else if typedPointer == 0 cannot be true unless there's a different char at start
     * - only move namePointer when equal chars are encountered, so if you didn't traverse it all then it's not long typed
     * - typed.charAt(typedPointed) != typed.charAt(typedPointed-1) handles last unrepeated character or unique one in typed
     * */

    public boolean isLongPressedName(String name, String typed) {
        int namePointer = 0;
        for(int typedPointer = 0; typedPointer <typed.length(); typedPointer++) {
            if(namePointer < name.length() && name.charAt(namePointer) == typed.charAt(typedPointer)){
                namePointer++;
            } else if(typedPointer == 0 || typed.charAt(typedPointer) != typed.charAt(typedPointer-1))
                return false;
        }
        return namePointer == name.length();
    }
}
