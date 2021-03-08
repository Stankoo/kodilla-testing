package com.kodilla.exception.test;

class ExceptionHandling {

    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            System.out.println(secondChallenge.probablyIWillThrowException(0.5, 1.5));
        } catch (Exception e) {
            System.out.println("Exception has been found! " + e);
        } finally {
            System.out.println("End of program.");
        }
    }
}
