package dk.ek.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Test calculator: Addition1")
    void addition(){
        float actual = calculator.addition(2,3);
        float expected = 5;
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Test calculator: Addition2")
    void addition2(){
        float actual = calculator.addition(4,5);
        float expected = 9;
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Test calculator: subtraction")
    void subtraction2(){
        float actual = calculator.subtraction(8,3);
        float expected = 5;
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Test calculator: subtraction1")
    void subtraction(){
        float actual = calculator.subtraction(4,5);
        float expected = -1;
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Test calculator: multiplication1")
    void multiplication1(){
        float actual = calculator.multiplication(4,5);
        float expected = 20;
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Test calculator: division")
    void division(){
        float actual = calculator.division(5,5);
        float expected = 1;
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Test calculator: division1")
    void division1(){
        float actual = calculator.division(4,2);
        float expected = 2;
        assertEquals(expected,actual);
    }
}