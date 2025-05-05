package com.example;

public class Calculator {

    // Method untuk operasi penjumlahan
    public double tambah(double a, double b) {
        return a + b;
    }

    // Method untuk operasi pengurangan
    public double kurang(double a, double b) {
        return a - b;
    }

    // Method untuk operasi perkalian
    public double kali(double a, double b) {
        return a * b;
    }

    // Method untuk operasi pembagian
    public double bagi(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Pembagi tidak boleh nol");
        }
        return a / b;
    }

    // Method untuk memilih operator dan melakukan perhitungan
    public double compute(double a, double b, String operator) {
        switch (operator) {
            case "+":
                return tambah(a, b);
            case "-":
                return kurang(a, b);
            case "*":
                return kali(a, b);
            case "/":
                return bagi(a, b);
            default:
                throw new IllegalArgumentException("Operator tidak valid");
        }
    }
}
