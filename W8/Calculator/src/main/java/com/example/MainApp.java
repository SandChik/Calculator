package com.example;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        Validator validator = new Validator();

        // Input angka pertama
        System.out.print("Masukkan angka pertama: ");
        String input1 = scanner.nextLine();

        // Input angka kedua
        System.out.print("Masukkan angka kedua: ");
        String input2 = scanner.nextLine();

        // Input operator
        System.out.print("Masukkan operator (+, -, *, /): ");
        String operator = scanner.nextLine();

        // Validasi input
        if (validator.validateInput(input1, input2, operator)) {
            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);

            // Perhitungan dan tampilkan hasil
            double result = calculator.compute(num1, num2, operator);
            System.out.println("Hasil: " + result);
        } else {
            System.out.println("Input tidak valid, program dihentikan.");
        }

        scanner.close();
    }
}
