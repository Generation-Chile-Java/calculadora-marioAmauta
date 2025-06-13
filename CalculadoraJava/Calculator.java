package CalculadoraJava;

import java.text.MessageFormat;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // create user input variable
        Scanner userInput = new Scanner(System.in);

        // Ask for first number
        System.out.println("Indica el Número 1");
        int numberOne = userInput.nextInt();

        // Ask for second number
        System.out.println("Indica el Número 2");
        int numberTwo = userInput.nextInt();

        // show basic arithmetic operations

        // addition
        int additionResult  = numberOne + numberTwo;
        System.out.println(MessageFormat.format("Resultado de la suma de Número {0} y Número {1} = {2}", numberOne, numberTwo, additionResult));

        // subtraction
        int subtractionResult = numberOne - numberTwo;
        System.out.println(MessageFormat.format("Resultado de la resta de Número {0} y Número {1} = {2}", numberOne, numberTwo, subtractionResult));

        // multiplication
        int multiplicationResult = numberOne * numberTwo;
        System.out.println(MessageFormat.format("Resultado de la multiplicación de Número {0} y Número {1} = {2}", numberOne, numberTwo, multiplicationResult));

        // division
        int divisionResult = numberOne / numberTwo;
        System.out.println(MessageFormat.format("Resultado de la división de Número {0} y Número {1} = {2}", numberOne, numberTwo, divisionResult));

        // module
        int moduleResult = numberOne % numberTwo;
        System.out.println(MessageFormat.format("Resultado del modulo de Número {0} y Número {1} = {2}", numberOne, numberTwo, moduleResult));
    }
}
