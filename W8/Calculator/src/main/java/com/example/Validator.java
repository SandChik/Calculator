package com.example;

public class Validator {

    // Validasi apakah input adalah angka
    public boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Validasi apakah angka berada dalam rentang yang sesuai
    public boolean isInRange(double value) {
        return value >= -32768 && value <= 32767;
    }

    // Validasi operator yang diterima
    public boolean isValidOperator(String operator) {
        return operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/");
    }

    // Validasi keseluruhan input
    public boolean validateInput(String str1, String str2, String operator) {
        if (!isNumeric(str1) || !isNumeric(str2)) {
            System.out.println("Error: Input harus angka.");
            return false;
        }

        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);

        if (!isInRange(num1) || !isInRange(num2)) {
            System.out.println("Error: Nilai harus antara -32,768 hingga 32,767.");
            return false;
        }

        if (!isValidOperator(operator)) {
            System.out.println("Error: Operator tidak valid.");
            return false;
        }

        if (operator.equals("/") && num2 == 0) {
            System.out.println("Error: Pembagi tidak boleh nol.");
            return false;
        }

        return true;
    }
}
