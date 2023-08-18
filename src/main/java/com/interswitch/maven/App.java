package com.interswitch.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UpperLowerCase upperLowerCase = new UpperLowerCase();
        System.out.printf("%s to %s\n", "Hello World",
                upperLowerCase.wordToUpperCase("Hello World"));
        System.out.printf("%s to %s\n", "Hello World",
                upperLowerCase.wordToLowerCase("Hello World"));
    }
}
