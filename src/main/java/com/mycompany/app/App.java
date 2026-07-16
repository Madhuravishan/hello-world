package com.mycompany.app;

// Imports required for JColor to function
import static com.diogonunes.jcolor.Ansi.colorize;
import static com.diogonunes.jcolor.Attribute.*;

public class App {
    public static void main(String[] args) {
        
        // Prints colored text to the console
        System.out.println(colorize("Green text", GREEN_TEXT()));
        System.out.println(colorize("Red on white", RED_TEXT(), WHITE_BACK()));
        
        // Prints standard text
        System.out.println("Hello World!");
    }
}