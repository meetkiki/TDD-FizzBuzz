package com.thoughtworks.fizzbuzz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.thoughtworks.fizzbuzz.FizzBuzzAlgorithm.BUZZ;
import static com.thoughtworks.fizzbuzz.FizzBuzzAlgorithm.BUZZ_WHIZZ;
import static com.thoughtworks.fizzbuzz.FizzBuzzAlgorithm.FIZZ;
import static com.thoughtworks.fizzbuzz.FizzBuzzAlgorithm.FIZZ_BUZZ;
import static com.thoughtworks.fizzbuzz.FizzBuzzAlgorithm.FIZZ_BUZZ_WHIZZ;

public class FizzBuzzTest {

    private FizzBuzzAlgorithm algorithm;

    @Before
    public void init() {
        algorithm = new FizzBuzzAlgorithm();
    }

    /**
     * 1.输入一个不包含3和5的数字，并返回预期的数字
     * 2.输入一个数字3的倍数，预期返回Fizz
     * 3.输入一个数字5的倍数，预期返回Buzz
     * 4.输入一个数字3和5的倍数，预期返回FizzBuzz
     * 5.输入一个数字三个特殊数的倍数，预期返回FizzBuzzWhizz
     * 6.输入一个数字包含3，预期返回Fizz
     * 7.输入一个数字包含3，同时又是倍数时，仍然返回Fizz，比如要报30的同学只报Fizz，不报FizzBuzz
     * 8.输入一个数字包含5，同时又是7倍数时，忽略3的倍数判定,预期返回BuzzWhizz，比如要报35的同学只报BuzzWhizz，不报Fizz
     * 9.输入一个数字包含7，同时又是3倍数时，忽略3和5的包含判定，预期返回Fizz，比如要报75的同学只报Fizz
     */
    @Test
    public void should_return_number_when_given_not_included_three_or_five() {
        Integer excepted = 2;
        Integer result = (Integer) algorithm.fizzBuzz(excepted);
        Assert.assertEquals(excepted, result);
    }


    @Test
    public void should_return_Fizz_when_given_Multiples_of_three() {
        Integer excepted = 3;
        String result = (String) algorithm.fizzBuzz(excepted);
        Assert.assertEquals(FIZZ, result);
    }


    @Test
    public void should_return_Buzz_when_given_Multiples_of_five() {
        Integer excepted = 5;
        String result = (String) algorithm.fizzBuzz(excepted);
        Assert.assertEquals(BUZZ, result);
    }

    @Test
    public void should_return_FizzBuzz_when_given_Multiples_of_three_and_five() {
        Integer excepted = 15;
        String result = (String) algorithm.fizzBuzz(excepted);
        Assert.assertEquals(FIZZ_BUZZ, result);
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_given_Multiples_of_three_and_five_and_seven() {
        Integer excepted = 105;
        String result = (String) algorithm.fizzBuzz(excepted);
        Assert.assertEquals(FIZZ_BUZZ_WHIZZ, result);
    }


    @Test
    public void should_return_Fizz_when_given_included_of_three() {
        Integer excepted = 105;
        String result = (String) algorithm.fizzBuzz(excepted);
        Assert.assertEquals(FIZZ_BUZZ_WHIZZ, result);
    }

    @Test
    public void should_return_BuzzWhizz_when_given_included_of_five() {
        Integer excepted = 35;
        String result = (String) algorithm.fizzBuzz(excepted);
        Assert.assertEquals(BUZZ_WHIZZ, result);
    }

    @Test
    public void should_return_Fizz_when_given_included_of_seven() {
        Integer excepted = 75;
        String result = (String) algorithm.fizzBuzz(excepted);
        Assert.assertEquals(FIZZ, result);
    }

}
