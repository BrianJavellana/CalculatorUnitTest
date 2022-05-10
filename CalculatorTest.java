package com.ecpe205;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculatorTest {

    @ParameterizedTest
    @ValueSource(ints = {4,15625,9,343,729})
    void shouldExponentialValues(){
        Calculator calc = new Calculator();
        assertEquals(4, calc.power(2,2));
        assertEquals(15625, calc.power(5,6));
        assertEquals(9, calc.power(3,2));
        assertEquals(343, calc.power(7,3));
        assertEquals(729, calc.power(9,3));

    }
    @ParameterizedTest
    @ValueSource(ints ={720,5040,24,120,40320})
    void shouldFactorialSolve(){
        Calculator calc = new Calculator();
        assertEquals(720, calc.factorial(6));
        assertEquals(5040, calc.factorial(7));
        assertEquals(24, calc.factorial(4));
        assertEquals(120, calc.factorial(5));
        assertEquals(40320, calc.factorial(8));
    }


    /**  @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void shouldValueWithOne(int value){
        Calculator calc = new Calculator();
        assertEquals(value + 1, calc.sum(value,1));
    }
    @ParameterizedTest
    @MethodSource("sumInputValues")
    void shouldSumInputValues(int a, int b){
        Calculator calc = new Calculator();
        assertEquals(a + b, calc.sum(a, b) );
    }

    static Stream<Arguments> sumInputValues(){
        return Stream.of(
                Arguments.of(1,2),
                Arguments.of(4,6),
                Arguments.of(2,7),
                Arguments.of(3,7),
                Arguments.of(3,8)
        );
    }**/

}