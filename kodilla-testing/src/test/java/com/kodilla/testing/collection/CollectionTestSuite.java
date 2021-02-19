package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }


    @DisplayName("When create empty list" +
            "then testOddNumbersExterminatorEmptyList should return empty list ")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        //When
        List<Integer> result = OddNumbersExterminator.exterminate(numbers);
        List<Integer> expectedResult = new ArrayList<>();

        //Then
        Assertions.assertEquals(expectedResult, result);

    }

    @DisplayName("When create a list with numbers" +
            "then testOddNumbersExterminatorNormalList should return list of even numbers ")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(1);
        numbers.add(10);
        numbers.add(3);

        //When
        List<Integer> result = OddNumbersExterminator.exterminate(numbers);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(8);
        expectedResult.add(10);
        //Then
        Assertions.assertEquals(expectedResult, result);
    }

}
