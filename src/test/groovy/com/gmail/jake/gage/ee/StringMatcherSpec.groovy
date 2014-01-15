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
    def "isTrue(\"True\") == true"() {
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
    def "doesNotBeginWithNumber(\"1abcd\") == false"() {
        expect: StringMatcher.doesNotBeginWithNumber("1abcd") == false
    }
    def "doesNotBeginWithNumber(\"a1bcd\") == true"() {
        expect: StringMatcher.doesNotBeginWithNumber("a1bcd") == true
    }
    def "doesNotBeginWithNumber(\"asdfdsf\") == true"() {
        expect: StringMatcher.doesNotBeginWithNumber("asdfdsf") == true
    }
    
    def "doesNotContainB(\"1\") == true"() {
        expect: StringMatcher.doesNotContainB("1") == true
    }
    def "doesNotContainB(\"abcksdfkdskfsdfdsf\") == false"() {
        expect: StringMatcher.doesNotContainB("abcksdfkdskfsdfdsf") == false
    }
    def "doesNotContainB(\"skdskfjsmcnxmvjwque484242\") == true"() {
        expect: StringMatcher.doesNotContainB("skdskfjsmcnxmvjwque484242") == true
    }
    
    def "lessThanThreeHundred(\"288\") == true"() {
        expect: StringMatcher.lessThanThreeHundred("288") == true
    }
    def "lessThanThreeHundred(\"3288\") == false"() {
        expect: StringMatcher.lessThanThreeHundred("3288") == false
    }
    def "lessThanThreeHundred(\"328 8\" == false)"() {
        expect: StringMatcher.lessThanThreeHundred("328 8") == false
    }
    def "lessThanThreeHundred(\"1\") == true"() {
        expect: StringMatcher.lessThanThreeHundred("1") == true
    }
    def "lessThanThreeHundred(\"99\") == true"() {
        expect: StringMatcher.lessThanThreeHundred("99") == true
    }
    def "lessThanThreeHundred(\"300\") == false"() {
        expect: StringMatcher.lessThanThreeHundred("300") == false
    }
}