package com.interswitch.maven;

import java.time.LocalDateTime;

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

        System.out.println("New Go-Home Feature by Backbone Team at "
                + LocalDateTime.now());
    }
}
