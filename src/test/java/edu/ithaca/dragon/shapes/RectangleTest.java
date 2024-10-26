package edu.ithaca.dragon.shapes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;




public class RectangleTest {

    @Test
    public void TestConstructorError(){
        //This makes sure that having either a negative length or width will cause it to throw an error
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-1,2));
    }

    @Test
    public void testCalcArea(){
        //This makes sure that the math that I do to calculate the area is right
        Rectangle myRectangle = new Rectangle(3, 4);
        assertEquals(12,myRectangle.calcArea(),0.00001);
    }

    @Test
    public void TestdoubleSize(){
        //This uses the area to make sure that it doubles
        Rectangle myRectangle = new Rectangle(3, 4);
        myRectangle.doubleSize();
        assertEquals(48,myRectangle.calcArea(),0.00001);

    }
    @Test
    public void TestLongestLineWithin(){
        //This makes sure that using the pythagorean therom works when trying to find the longest line
        Rectangle myRectangle = new Rectangle(3,4);
        assertEquals(5,myRectangle.longestLineWithin(),0.0001);
    }


}
