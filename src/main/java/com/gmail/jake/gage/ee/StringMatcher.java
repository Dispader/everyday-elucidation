package com.gmail.jake.gage.ee;

public class StringMatcher
{
    /**
     * Returns <code>true</code> if the given input string exactly matches "true", <code>false</code> otherwise.
     * 
     * @param input an input <code>String</code>
     * @return <code>true</code> if the string exactly matches "true", <code>false</code> otherwise
     */
    public static boolean isPreciselyTrue(String input) {
        return input.matches("true");
    }
    
    /**
     * Returns <code>true</code> if the given input string heuristically matches "true", <code>false</code> otherwise.
     * 
     * @param input an input <code>String</code>
     * @return <code>true</code> if the string heuristically matches "true", <code>false</code> otherwise
     */
    public static boolean isTrue(String input) {
        return input.matches("[Tt]rue");
    }
    
    /**
     * Returns <code>true</code> if the given input string is heuristically positive in nature, <code>false</code> otherwise.
     * 
     * @param input an input <code>String</code>
     * @return <code>true</code> if the string is heuristically positive in nature, <code>false</code> otherwise
     */
    public static boolean isPositive(String input) {
        return input.matches("[Tt]rue|[Yy]es");
    }
    
    /**
     * Returns <code>true</code> if the given input string contains exactly the string "true", <code>false</code> otherwise.
     * 
     * @param input an input <code>String</code>
     * @return <code>true</code> if the string contains "true", <code>false</code> otherwise
     */
    public static boolean containsTrue(String input) {
        return input.matches(".*true.*");
    }
    
    /**
     * Returns <code>true</code> if the given input string contains exactly three alphabetical characters, <code>false</code> otherwise.
     * 
     * @param input an input <code>String</code>
     * @return <code>true</code> if the string contains exactly three alphabetical characters, <code>false</code> otherwise
     */
    public static boolean isThreeLetters(String input) {
        return input.matches("[a-zA-Z]{3}");
    }
    
    /**
     * Returns <code>true</code> if the given input string does not begin with a numeric character, <code>false</code> otherwise.
     * 
     * @param input an input <code>String</code>
     * @return <code>true</code> if the string does not begin with a numeric character, <code>false</code> otherwise
     */
    public static boolean doesNotBeginWithNumber(String input) {
        return input.matches("^[^\\d].*");
    }
    
    /**
     * Returns <code>true</code> if the given input string does not contain 'b', <code>false</code> otherwise.
     * <p>
     * This method is present to demonstrate a basic regular expression intersection operation.
     * 
     * @param input an input <code>String</code>
     * @return <code>true</code> if the string does not contain 'b', <code>false</code> otherwise
     */
    public static boolean doesNotContainB(String input) {
        return input.matches("([\\w&&[^b]])*");
    }
    
    /**
     * Returns <code>true</code> if the given input string can be interpreted as a number less than three hundred, <code>false</code> otherwise.
     * 
     * @param input an input <code>String</code>
     * @return <code>true</code> if the string can be interpreted as a number less than three hundred, <code>false</code> otherwise
     */
    public static boolean lessThanThreeHundred(String input) {
        return input.matches("[12]?[0-9]{1,2}");
    }
}