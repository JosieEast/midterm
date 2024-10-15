package cis;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class FibonacciTest {

    @Test
    public void testFibonacciOfZero() {
        // Test the base case where n = 0
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    public void testFibonacciOfOne() {
        // Test the base case where n = 1
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    public void testFibonacciOfTwo() {
        // Test where n = 2, expected result is 1
        assertEquals(1, Fibonacci.fibonacci(2));
    }

    @Test
    public void testFibonacciOfTen() {
        // Test where n = 10, expected result is 55
        assertEquals(55, Fibonacci.fibonacci(10));
    }

    @Test
    public void testFibonacciOfFifteen() {
        // Test where n = 15, expected result is 610
        assertEquals(610, Fibonacci.fibonacci(15));
    }

  
    }

