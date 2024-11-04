package edu.ithaca.dragon.shapes;

public class Triangle implements Shape{
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    
    public double calcArea() {
        return 0.5 * base * height;
    }

    @Override
    public void doubleSize() {
        base *= 2;
        height *= 2;
    }

    
    public double longestLineWithin() {
        return Math.sqrt(base * base + height * height); 
    }

    public String toString(){
        return "triangle " + "base: "+ base + "height: "+ height;
    }
}
