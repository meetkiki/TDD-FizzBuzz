package com.thoughtworks.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class NumberIncludedTest {


    @Test
    public void should_return_true_when_given_thirteen_and_three(){
        FizzBuzzAlgorithm algorithm = new FizzBuzzAlgorithm();
        boolean included = algorithm.included_of_n(13, 3);
        Assert.assertTrue(included);
    }

    @Test
    public void should_return_false_when_given_fourteen_and_three(){
        FizzBuzzAlgorithm algorithm = new FizzBuzzAlgorithm();
        boolean included = algorithm.included_of_n(14, 3);
        Assert.assertFalse(included);
    }

}
