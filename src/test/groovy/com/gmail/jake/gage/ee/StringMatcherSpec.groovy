package com.gmail.jake.gage.ee

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
}