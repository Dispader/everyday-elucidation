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
}
