package com.epam.calculator_Desgin_Principles;

public interface MathCommand<E> {
    abstract E execute(E operand1, E operand2);
}
