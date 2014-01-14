package com.gmail.jake.gage.ee

import com.sun.beans.decoder.FalseElementHandler;

import spock.lang.Specification;

class StringMatcherSpec extends Specification
{
    def "isPreciselyTrue(\"true\") == true"() {
        expect: StringMatcher.isPreciselyTrue("true") ==  true
    }
    def "isPreciselyTrue(\"true2\") == false"() {
        expect: StringMatcher.isPreciselyTrue("true2") ==  false
    }
    def "isPreciselyTrue(\"True\") == false"() {
        expect: StringMatcher.isPreciselyTrue("True") ==  false
    }
    
    def "isTrue(\"true\") == true"() {
        expect: StringMatcher.isTrue("true") ==  true
    }
    def "isTrue(\"true2\") == false"() {
        expect: StringMatcher.isTrue("true2") ==  false
    }
    def "isTrue(\"True\") == false"() {
        expect: StringMatcher.isTrue("True") ==  true
    }
    
    def "isPositive(\"true\") == true"() {
        expect: StringMatcher.isPositive("true") == true
    }
    def "isPositive(\"yes\") == true"() {
        expect: StringMatcher.isPositive("yes") == true
    }
    def "isPositive(\"Yes\") == true"() {
        expect: StringMatcher.isPositive("Yes") == true
    }
    def "isPositive(\"no\") == false"() {
        expect: StringMatcher.isPositive("no") == false
    }
    
    def "containsTrue(\"thetruewithin\") == true"() {
        expect: StringMatcher.containsTrue("thetruewithin") == true
    }
    
    def "isThreeLetters(\"abc\") == true"() {
        expect: StringMatcher.isThreeLetters("abc") == true
    }
    def "isThreeLetters(\"abcd\") == false"() {
        expect: StringMatcher.isThreeLetters("abcd") == false
    }
    
    def "doesNotBeginWithNumber(\"abc\") == true"() {
        expect: StringMatcher.doesNotBeginWithNumber("abc") == true
    }
    def "doesNotBeginWithNumber(\"1abcd\") == true"() {
        expect: StringMatcher.doesNotBeginWithNumber("1abcd") == false
    }
    def "doesNotBeginWithNumber(\"a1bcd\") == true"() {
        expect: StringMatcher.doesNotBeginWithNumber("a1bcd") == true
    }
    def "doesNotBeginWithNumber(\"asdfdsf\") == true"() {
        expect: StringMatcher.doesNotBeginWithNumber("asdfdsf") == true
    }
}