package com.perscholas.java_basics.Demos;
// importing Arrays to convert array to string
// used for printing arrays
import java.util.Arrays;
/*
The split() method divides the string at the specified regex and returns an array of substrings. The syntax of the string split() method is:
string.split(String regex, int limit)
regex - the string is divided at this regex (can be strings)
limit (optional) - controls the number of resulting substrings

If the limit parameter is not passed, split() returns all possible substrings.
*/

public class SplitDemo {
    public static void main(String[] args) {
        String vowels = "a::b::c::d:e";

        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");

        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));
    }
}
