package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testTambah() {
        assertEquals(5, calculator.tambah(2, 3), 0.001);
    }

    @Test
    public void testKurang() {
        assertEquals(1, calculator.kurang(5, 4), 0.001);
    }

    @Test
    public void testKali() {
        assertEquals(6, calculator.kali(2, 3), 0.001);
    }

    @Test
    public void testBagi() {
        assertEquals(2, calculator.bagi(6, 3), 0.001);
    }

    @Test
    public void testBagiDenganNol() {
        assertThrows(IllegalArgumentException.class, () -> calculator.bagi(5, 0)); // Pembagian dengan nol harus melempar exception
    }
}
