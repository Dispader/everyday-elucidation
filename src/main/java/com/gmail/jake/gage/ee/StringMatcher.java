package com.gmail.jake.gage.ee;

public class StringMatcher
{
    /**
     * Returns <code>true</code> if the given input string exactly matches "true".
     * 
     * @param input an input <code>String</code>
     * @return <code>true</code> if the string exactly matches "true"
     */
    public static boolean isPreciselyTrue(String input) {
        return input.matches("true");
    }
    
    /**
     * Returns <code>true</code> if the given input string heuristically matches "true".
     * 
     * @param input an input <code>String</code>
     * @return <code>true</code> if the string heuristically matches "true"
     */
    public static boolean isTrue(String input) {
        return input.matches("[Tt]rue");
    }
    
    /**
     * Returns <code>true</code> if the given input string is heuristically positive in nature.
     * 
     * @param input an input <code>String</code>
     * @return <code>true</code> if the string is heuristically positive in nature
     */
    public static boolean isPositive(String input) {
        return input.matches("[Tt]rue|[Yy]es");
    }
    
    /**
     * Returns <code>true</code> if the given input string contains exactly the string "true".
     * 
     * @param input an input <code>String</code>
     * @return <code>true</code> if the string contains "true"
     */
    public static boolean containsTrue(String input) {
        return input.matches(".*true.*");
    }
    
    /**
     * Returns <code>true</code> if the given input string contains exactly three alphabetical characters.
     * 
     * @param input an input <code>String</code>
     * @return <code>true</code> if the string contains exactly three alphabetical characters
     */
    public static boolean isThreeLetters(String input) {
        return input.matches("[a-zA-Z]{3}");
    }
    
    /**
     * Returns <code>true</code> if the given input string does not begin with a numeric character.
     * 
     * @param input an input <code>String</code>
     * @return <code>true</code> if the string does not begin with a numeric character
     */
    public static boolean doesNotBeginWithNumber(String input) {
        return input.matches("^[^\\d].*");
    }
    
    /**
     * Returns <code>true</code> if the given input string does not contain 'b'.
     * <p>
     * This method is present to demonstrate a basic regular expression intersection operation.
     * 
     * @param input an input <code>String</code>
     * @return <code>true</code> if the string does not contain 'b'
     */
    public static boolean doesNotContainB(String input) {
        return input.matches("([\\w&&[^b]])*");
    }
}