package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProbablyWillThrowExceptionTestSuite {
    @Test
    void testxbetween1and2() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertDoesNotThrow((Executable) ()->secondChallenge.probablyIWillThrowException(1.5, 2.0));
    }

    @Test
    void testxEquals2() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertThrows(Exception.class, ()->secondChallenge.probablyIWillThrowException(2.0, 1.0));
    }
    @Test
    void testxLessThan1() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertThrows(Exception.class, ()->secondChallenge.probablyIWillThrowException(0.6, 1.0));
    }
    @Test
    void testxEquals1() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertDoesNotThrow((Executable) ()->secondChallenge.probablyIWillThrowException(1.0, 2.0));
    }
    @Test
    void testyEquals1andHalf() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();
        // when & then
        assertThrows(Exception.class, ()->secondChallenge.probablyIWillThrowException(1.5, 1.5));
    }


}
