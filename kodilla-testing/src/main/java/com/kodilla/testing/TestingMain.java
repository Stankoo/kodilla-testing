package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calc = new Calculator();
        Integer addresult = calc.add(6, 8);
        Integer substractresult = calc.substract(9,56);
        if (addresult.equals(6+8)) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        if (substractresult.equals(9-56)) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

    }
}