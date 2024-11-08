package edu.ithaca.dragon.shapes;
public class Rectangle implements Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calcArea(){
        return this.length * this.width;
    }

    public void doubleSize(){
        this.length *= 2;
        this.width *= 2;
    }

    public double longestLineWithin(){
        return Math.sqrt(this.length * this.length + this.width * this.width);
    }

    public String toString(){
        return "Rectangle "+"length: "+ length + "width: " + width;
    }

}
