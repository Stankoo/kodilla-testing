package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("poem", poem -> "ABC" + poem + "ABC");
        poemBeautifier.beautify("poem", poem -> poem.toUpperCase());
        PoemDecorator poemDotter = poem -> {
            if ( !poem.endsWith(".") ) {
                poem = poem + ".";
            }
            return  poem;
        };
        poemBeautifier.beautify("poem", poemDotter);
        poemBeautifier.beautify("poem", poem -> "Beginning: " + poem);

    }
}