package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class TriangleTest {
   
    @Test
    public void calcAreaTest(){
       Triangle myTriangle = new Triangle(3.0,4.0);
       assertEquals(6, myTriangle.calcArea()); 
    }

    @Test
    public void doubleSizeTest(){
        Triangle myTriangle = new Triangle(3.0,4.0);
        myTriangle.doubleSize();
        assertEquals(24,myTriangle.calcArea());
    }

    @Test
    public void longestLineWithin(){
        Triangle myTriangle = new Triangle(3.0,4.0);
        assertEquals(5,myTriangle.longestLineWithin());
    }





}
