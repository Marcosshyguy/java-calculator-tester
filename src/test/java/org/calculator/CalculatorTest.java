package org.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {



    @Test
    @DisplayName("Test addizione")
    void add() {
//    assertEquals(0.45899999141693115 ,Calculator.add((float)0.200, (float)0.259),"addizione non andata a buon fine");
//    assertThrows(RuntimeException.class,() -> Calculator.add( (float)0.3, (float)0.6),"niente da fare");
    }

    @Test
    @DisplayName("Test sottrazione")
    void subtract() {
//        assertEquals(0.45899999141693115 , Calculator.subtract(0.200, 0.259),"sottrazione non andata a buon fine");
//        assertThrows(RuntimeException.class, () -> Calculator.subtract(2, 1),"niente da fare");
    }
    @Test
    @DisplayName("Test divisione")
    void divide() {
        assertEquals(0.7722007632255554 , Calculator.divide((float) 0.200f, (float)0.259f),"divisione non andata a buon fine");
//        assertThrows(RuntimeException.class, () -> Calculator.divide(2, 1),"niente da fare");
    }

    @Test
    @DisplayName("Test moltiplicazione")
    void multiply() {
        assertEquals(0.05180000141263008 , Calculator.multiply((float) 0.200f, (float)0.259f),"divisione non andata a buon fine");
    }
}