package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void sampleTestThatPasses(){
        assertEquals("This test should pass", "This test should pass");
        assertTrue(8>5);
        assertFalse(8<5);
    }
    
    @Test
    public void calcAreaTest(){
        Circle myCircle = new Circle(1);
        //3rd parameter says how far off it can be since it is a double
        assertEquals(3.1415, myCircle.calcArea(), 0.0001);
        
        myCircle = new Circle(5.5);
        assertEquals(95.030375, myCircle.calcArea(), 0.0001);

        myCircle = new Circle(0.001);
        assertEquals(0.00000314159, myCircle.calcArea(), 0.0000000001);
    }

    @Test
    public void TestConstructorError(){
        //This makes sure that the radius cant be under 0.
        assertThrows(IllegalArgumentException.class, () -> new Circle(0));
    }
    @Test
    public void TestLongestLineWithin() {
        //This makes sure that the longest line within has the correct arithmetic
    Circle myCircle = new Circle(2);
    assertEquals(4.0, myCircle.longestLineWithin(), 0.0001);
}

    @Test
    public void TestdoubleSize(){
        //I use the longest line method to make sure that when I double the size my longest line also doubles. 
        Circle myCircle = new Circle (1);
        myCircle.doubleSize();
        assertEquals(4,myCircle.longestLineWithin(),0.001);
    }



    }
