package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public static List<Integer> exterminate(List<Integer> numbers){
        List<Integer> evens = new ArrayList<>();
        for (Integer value : numbers) {
            if (value%2==0) {
                evens.add(value);
            }
        }
        return evens;
    }
}
