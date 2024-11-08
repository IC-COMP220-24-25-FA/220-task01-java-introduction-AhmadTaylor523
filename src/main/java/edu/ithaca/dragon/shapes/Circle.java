package edu.ithaca.dragon.shapes;

public class Circle implements Shape{
    private double radius;

    /**
     * @throws IllegalArgumentException if radius is not a positive number
     */
    public Circle(double radius){
        if (radius <= 0){
            throw new IllegalArgumentException("radius cant be negative");
        }        
        this.radius = radius;
    }
    
    /**
     * @return the area of this circle
     */
    public double calcArea(){
        return Math.PI * (radius*radius);
    }

    /**
     * @post doubles the size of this circle
     */
    public void doubleSize(){
        this.radius *= 2;
    }

    /**
     * @return the longest straight line that can be drawn within this circle
     */
    public double longestLineWithin(){
        return radius * 2;
    }

    public String toString(){
        return "circle " + "radius: "+ radius;
    }
}
