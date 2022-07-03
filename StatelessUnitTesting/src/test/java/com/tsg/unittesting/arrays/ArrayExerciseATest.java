/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.unittesting.arrays;

import static com.tsg.unittesting.arrays.ArrayExerciseA.maxOfArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Teresa
 */
public class ArrayExerciseATest {
    
    public ArrayExerciseATest() {
    }

    @Test
    public void testMaxOfArray() {
        // ARRANGE
        int expectedLargestNumber = 7;
        int[] numbers = {3, 5, 7, 0};
        // ACT
        int max = maxOfArray(numbers);
        // ASSERT - w/ Message
        assertEquals(expectedLargestNumber, max, "Expected 7 as the max.");
    }
    
}
