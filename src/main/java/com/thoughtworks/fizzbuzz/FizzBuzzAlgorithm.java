package com.thoughtworks.fizzbuzz;

public class FizzBuzzAlgorithm {

    public static final Integer THREE = 3;
    public static final Integer FIVE = 5;
    public static final Integer SEVEN = 7;


    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";
    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String BUZZ_WHIZZ = "BuzzWhizz";
    public static final String FIZZ_WHIZZ = "FizzWhizz";
    public static final String FIZZ_BUZZ_WHIZZ = "FizzBuzzWhizz";

    public Object fizzBuzz(int in){

        if (!included_of_n(in,FIVE)){
            if (included_of_n(in,THREE)){
                return FIZZ;
            }
        }

        if (included_of_n(in,SEVEN)){
            if (multiples_of_n(in,THREE)) {
                return FIZZ;
            }
        }

        if (multiples_of_n(in,THREE)
                && multiples_of_n(in,FIVE)
                && multiples_of_n(in,SEVEN)){
            return FIZZ_BUZZ_WHIZZ;
        }else if (multiples_of_n(in,THREE)
                && multiples_of_n(in,FIVE)){
            return FIZZ_BUZZ;
        }else if (multiples_of_n(in,THREE)
                && multiples_of_n(in,SEVEN)){
            return FIZZ_WHIZZ;
        }else if (multiples_of_n(in,FIVE)
                && multiples_of_n(in,SEVEN)){
            return BUZZ_WHIZZ;
        }else if (multiples_of_n(in,THREE)){
            return FIZZ;
        }else if (multiples_of_n(in,FIVE)){
            return BUZZ;
        }else if (multiples_of_n(in,SEVEN)){
            return WHIZZ;
        }
        return in;
    }

    public boolean included_of_n(int in,int n){
        int digits;
        while (in != 0){
            digits = in % 10;
            if (digits == n){
                return true;
            }
            in = in / 10;
        }
        return false;
    }

    private boolean multiples_of_n(int in,int n){
        return in % n == 0;
    }
}
