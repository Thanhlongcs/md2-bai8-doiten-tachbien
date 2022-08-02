package rikkei.academy.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rikkei.academy.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    public static final char ADDITION = '+';
    public static final char MULTIPLICATION = '*';
    public static final char SUBTRACTION = '-';
    public static final char DIVISION = '/';
    public static final char OPERATOR = '=';

    @Test
@DisplayName("testing subtraction")
    void testCalculateAdd(){
    int a = 2;
    int b = 1;
    char o = ADDITION;
    int expected = 2;
    int result = Calculator.calculate(a,b,o);
    assertEquals(expected,result);
}
    @Test
    @DisplayName("Testing subtraction")
    void testCalculateSub() {
        int firstOperand = 2;
        int secondOperand = 1;
        char operator = SUBTRACTION;
        int expected = 1;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("testing Multiplication")
void testCalculateMul(){
    int a = 2;
    int b = 2;
    char o = MULTIPLICATION;
    int expected = 4;
    int result =  Calculator.calculate(a,b,o);
    assertEquals(expected,result);
}
    @Test
    @DisplayName("Testing division")
    void testCalculateDiv() {
        int a = 6;
        int b = 3;
        char o = DIVISION;
        int expected = 2;

        int result = Calculator.calculate(a, b, o);
        assertEquals(expected, result);
    }


    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        int a = 2;
        int b = 0;
        char o = OPERATOR;

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(a, b, o);});
    }


}
