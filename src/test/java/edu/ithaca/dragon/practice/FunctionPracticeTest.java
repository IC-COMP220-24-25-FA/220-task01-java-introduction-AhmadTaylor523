package edu.ithaca.dragon.practice;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class FunctionPracticeTest {

    @Test
    public void largestOfThreeTest(){
        assertEquals(5, FunctionPractice.largestOfThree(4, 5, 2));
        assertEquals(5, FunctionPractice.largestOfThree(5, 4, 2));
        assertEquals(5, FunctionPractice.largestOfThree(4, 2, 5));
        assertEquals(5, FunctionPractice.largestOfThree(5, 5, 5));
        // These are important because it endures that no matter the order you give the numbers, the greatest number will be outputed. 

        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(-1, -1, -1));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, -1, 3));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.largestOfThree(5, 3, -1));
        // These are important because they ensure that you cant use negative numbers at all no matter the order
    }

    @Test
    public void calcSalePriceTest(){
        assertEquals(90.0, FunctionPractice.calcSalePrice(100, 10, 5), 0.01);
        assertEquals(95.0, FunctionPractice.calcSalePrice(100, 5, 0), 0.01);
        assertEquals(0.0, FunctionPractice.calcSalePrice(50, 100, 10), 0.01);
    }

    @Test
    public void testIsGoodDog() {
        assertTrue(FunctionPractice.isGoodDog(3, 2, true));
        assertFalse(FunctionPractice.isGoodDog(5, 0, false));
        assertFalse(FunctionPractice.isGoodDog(2, 3, false));
        assertFalse(FunctionPractice.isGoodDog(4, 0, true));
    }


    @Test
    public void testFindFirstLargest() {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 7, 2);
        assertEquals(3, FunctionPractice.findFirstLargest(numbers));
        assertEquals(-1, FunctionPractice.findFirstLargest(Arrays.asList()));
        assertEquals(0, FunctionPractice.findFirstLargest(Arrays.asList(10, 9, 8, 7)));
    }

    @Test
    public void testFindLastLargest() {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 7, 2);
        assertEquals(4, FunctionPractice.findLastLargest(numbers));
        assertEquals(-1, FunctionPractice.findLastLargest(Arrays.asList()));
        assertEquals(0, FunctionPractice.findLastLargest(Arrays.asList(10, 9, 8, 7)));
    }

    @Test
    public void testFindFirstMostOccurrencesOfLetter() {
        List<String> words = Arrays.asList("apple", "banana", "avocado", "grape");
        assertEquals("banana", FunctionPractice.findFirstMostOccurencesOfLetter(words, 'a'));
        assertEquals("apple", FunctionPractice.findFirstMostOccurencesOfLetter(words, 'p'));
        assertThrows(IllegalArgumentException.class, () -> FunctionPractice.findFirstMostOccurencesOfLetter(Arrays.asList(), 'a'));
    }


    
}
