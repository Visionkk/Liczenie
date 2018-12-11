package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorAppTest {

    @Test
    void addTwoPositiveIntegers() {
        //arrange
        CalculatorApp calc = new CalculatorApp();

        //act
        int suma = calc.add(1, 2);

        //assert
        assertEquals(3, suma, "Sprawdź, że dodawanie liczb całkowitych działa");
    }

    @Test
    void addTwoPositiveDoubles() {
        //arrange
        CalculatorApp calc = new CalculatorApp();

        //act
        double suma = calc.add(1.2, 2.4);

        //assert
        assertEquals(3.6, suma, 0.0000001, "Sprawdź, że dodawanie liczb niecałkowitych działa");
    }

    @Test
    void divideTwoIntegers() {
        //arrange
        CalculatorApp calc = new CalculatorApp();

        //act
        int iloraz = calc.divide(9, 3);

        //assert
        assertEquals(3, iloraz, 0.0000001, "Sprawdź, że dzielenie liczb całkowitych działa");
    }
}