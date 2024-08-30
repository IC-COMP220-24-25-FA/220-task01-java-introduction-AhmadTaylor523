import edu.ithaca.dragon.shapes.Rectangle;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import jdk.jfr.Timestamp;


public class RectangleTest {
    @Test
    public void testCalcArea(){
        Rectangle myRectangle = new Rectangle(3, 4);
        assertEquals(12,myRectangle.calcArea(),0.00001);
    }

    @Test
    public void TestdoubleSize(){
        Rectangle myRectangle = new Rectangle(3, 4);
        myRectangle.doubleSize();
        assertEquals(48,myRectangle.calcArea(),0.00001);

    }
    @Test
    public double TestLongestLineWithin(){
        Rectangle myRectangle = new Rectangle(3,4);
        assertEquals(5,myRectangle.longestLineWithin(),0.0001);
    }


}
