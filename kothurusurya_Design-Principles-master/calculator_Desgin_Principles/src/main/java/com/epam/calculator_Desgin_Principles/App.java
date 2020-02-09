package com.epam.calculator_Desgin_Principles;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MathCommand<Integer> command;
        Scanner s = new Scanner(System.in);
        int a,b,select;
        String c = "";
        do
        {
    
        System.out.println("Enter any two numbers:");
        a=s.nextInt();
        b=s.nextInt();
        
        System.out.println("Make your selection:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        
        select = s.nextInt();
        
        Integer result;
        
        if(select == 1)
        {
        	command = new AddCommand();
            result = command.execute(a,b);
            System.out.println("The result of "+a+"+"+b+" is "+result);
        }
        else if(select == 2)
        {
        	command = new SubtractCommand();
            result = command.execute(a,b);
            System.out.println("The result of "+a+"-"+b+" is "+result);
        }
        else if(select == 3)
        {
        	command = new MultiplyCommand();
            result = command.execute(a,b);
            System.out.println("The result of "+a+"*"+b+" is "+result);
        }
        else if(select == 4)
        {
        	command = new DivideCommand();
            result = command.execute(a,b);
            System.out.println("The result of "+a+"/"+b+" is "+result);
        }
        else
        {
        	System.out.println("This command is not supported!");
        }
        System.out.println("Continue(Y/N)");
        c = s.next();
 
        }while(c.equals("y")||c.equals("Y"));
    }
}