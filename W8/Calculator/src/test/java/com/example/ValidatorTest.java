package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidatorTest {

    Validator validator = new Validator();

    @Test
    public void testIsNumeric() {
        assertTrue(validator.isNumeric("123"));
        assertFalse(validator.isNumeric("abc"));
    }

    @Test
    public void testIsInRange() {
        assertTrue(validator.isInRange(100));
        assertFalse(validator.isInRange(35000));
    }

    @Test
    public void testIsValidOperator() {
        assertTrue(validator.isValidOperator("+"));
        assertTrue(validator.isValidOperator("-"));
        assertTrue(validator.isValidOperator("*"));
        assertTrue(validator.isValidOperator("/"));
        assertFalse(validator.isValidOperator("%"));
    }

    @Test
    public void testValidateInput() {
        // Test valid input
        assertTrue(validator.validateInput("123", "456", "+"));

        // Test invalid input
        assertFalse(validator.validateInput("abc", "456", "+"));
        assertFalse(validator.validateInput("123", "456", "&"));
        assertFalse(validator.validateInput("123", "50000", "+"));
    }
}
