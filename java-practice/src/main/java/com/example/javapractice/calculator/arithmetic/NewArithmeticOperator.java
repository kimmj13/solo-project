package com.example.javapractice.calculator.arithmetic;

import com.example.javapractice.calculator.arithmetic.calculate.PositiveNumber;

public interface NewArithmeticOperator {
    boolean supports(String operator);

    int calculate(PositiveNumber operand1, PositiveNumber operand2);
}
