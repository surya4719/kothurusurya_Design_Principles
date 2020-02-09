package com.epam.calculator_Desgin_Principles;

public class MultiplyCommand implements MathCommand<Integer>{
	 
    @Override
    public Integer execute(Integer operand1, Integer operand2) {
        return operand1 * operand2;
    }    
}  
