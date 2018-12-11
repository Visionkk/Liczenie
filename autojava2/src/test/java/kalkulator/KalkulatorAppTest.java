package kalkulator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorAppTest {

    @Test
    void addTwoPositiveIntegers() {
        //arrange
        KalkulatorApp kalkulatorek = new KalkulatorApp();

        //act
        int suma = kalkulatorek.add(1, 2);

        //assert
        assertEquals(3, suma, "Sprawdź, że dodawanie liczb całkowitych działa");
    }

    @Test
    void addTwoPositiveDoubles() {
        //arrange
        KalkulatorApp kalkulatorek = new KalkulatorApp();

        //act
        double suma = kalkulatorek.add(1.2, 2.4);

        //assert
        assertEquals(3.6, suma, 0.0000001, "Sprawdź, że dodawanie liczb niecałkowitych działa");
    }

    @Test
    void divideTwoIntegers() {
        //arrange
        KalkulatorApp kalkulatorek = new KalkulatorApp();

        //act
        int iloraz = kalkulatorek.divide(9, 3);

        //assert
        assertEquals(3, iloraz, 0.0000001, "Sprawdź, że dzielenie liczb całkowitych działa");
    }
}