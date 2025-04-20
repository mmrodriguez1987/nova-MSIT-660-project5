/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mynsu.msit.project5;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 
 * Brandon Cruz, Mark-Anthony Wright, Marcos Rodriguez, Jonathan Vargas
 */
public class StringUtilsIT { 
    
    /**
     * Test Case 01: Valid string should be stored correctly
     */
    @org.junit.jupiter.api.Test
    public void testConstructor_ValidString_ShouldStoreCorrectly() {
        StringUtils util = new StringUtils("abc");
        assertEquals("abc", util.getMyStr());
    }

    /** 
    * Test Case 02: Constructor should reject null input (expects NullPointerException)    
    */
    @org.junit.jupiter.api.Test
    public void testConstructor_NullInput_ShouldThrowNullPointerException() {
        Exception exception = assertThrows(NullPointerException.class, () -> new StringUtils(null, true));
        assertEquals("Parameter cannot be null", exception.getMessage());
    }

    /** 
    * Test Case 03: Constructor should reject empty string (expects NullPointerException)
    */
    @org.junit.jupiter.api.Test
    public void testConstructor_EmptyInput_ShouldThrowNullPointerException() {
        Exception exception = assertThrows(NullPointerException.class, () -> new StringUtils("", true));
        assertEquals("Parameter cannot be null", exception.getMessage());
    }

    /**
    * Test Case 04: Two-arg constructor with 'true' should store uppercase
    */
    @org.junit.jupiter.api.Test
    public void testConstructor_TwoArgs_UpperTrue_ShouldStoreUppercase() {
        StringUtils util = new StringUtils("abc", true);
        assertEquals("ABC", util.getMyStr());
    }

    /**
    * Test Case 05: Two-arg constructor with 'false' should store lowercase
    */
    @org.junit.jupiter.api.Test
    public void testConstructor_TwoArgs_UpperFalse_ShouldStoreLowercase() {
        StringUtils util = new StringUtils("ABC", false);
        assertEquals("abc", util.getMyStr());
    }

    /** 
     * Test Case 06: Two-arg constructor should reject empty string input
    */
    @org.junit.jupiter.api.Test
    public void testConstructor_TwoArgs_EmptyInput_ShouldThrowNullPointerException() {
        Exception exception = assertThrows(NullPointerException.class, () -> new StringUtils("", true));
        assertEquals("Parameter cannot be null", exception.getMessage());
    }

    /**
     * Test Case 07: convertToUpperCase should convert whole string, not skip first char
     */
    @org.junit.jupiter.api.Test
    public void testConvertToUpperCase_ShouldReturnAllUppercase() {
        StringUtils util = new StringUtils("abc");
        String result = util.convertToUpperCase();
        assertEquals("ABC", result); // This will fail with current code (it returns "BC")
    }

    /**
     * Test Case 08: updateToConcat should append string and update internal value
     */
    @org.junit.jupiter.api.Test
    public void testUpdateToConcat_ShouldAppendCorrectly() {
        StringUtils util = new StringUtils("hi");
        String result = util.updateToConcat("there");
        assertEquals("hithere", result);
        assertEquals("hithere", util.getMyStr());
    }
    /**
     * Test Case 09: getMyStr should return the stored value
     */
    @org.junit.jupiter.api.Test
    public void testGetMyStr_ShouldReturnStoredValue() {
        StringUtils util = new StringUtils("xyz");
        assertEquals("xyz", util.getMyStr());
    }

    /**
     * Test Case 10: endsWithChar should return true when last character matches
     */
    @org.junit.jupiter.api.Test
    public void testEndsWithChar_True() {
        StringUtils util = new StringUtils("boat");
        assertTrue(util.endsWithChar('t'));
    }

    /**
     * Test Case 11: endsWithChar should return false when last character does not match
     */
    @org.junit.jupiter.api.Test
    public void testEndsWithChar_False() {
        StringUtils util = new StringUtils("boat");
        assertFalse(util.endsWithChar('x'));
    }

    /**
     * Test Case 12: returnCharAt should return correct character for valid index
     */
    @org.junit.jupiter.api.Test
    public void testReturnCharAt_ValidIndex() {
        StringUtils util = new StringUtils("xyz");
        assertEquals('y', util.returnCharAt(1));
    }

    /**
     * Test Case 13: returnCharAt should throw IndexOutOfBoundsException for negative index
     */                                                       
    @org.junit.jupiter.api.Test
    public void testReturnCharAt_NegativeIndex_ShouldThrowIOOBE() {
        StringUtils util = new StringUtils("xyz");
        assertThrows(IndexOutOfBoundsException.class, () -> util.returnCharAt(-1)); // DEFECT 4
    }
}
