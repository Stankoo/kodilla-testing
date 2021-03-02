package com.kodilla.stream.array;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[]{1, 9, 25, 48, 6, 8, 11, 95, 45, 5, 15, 13, 48, 63, 98, 100, 47, 21, 74, 0};

        //When
        double average = ArrayOperations.getAverage(numbers).getAsDouble();
        //Then
        assertEquals(36.6, average, 0.00001);
    }
}

