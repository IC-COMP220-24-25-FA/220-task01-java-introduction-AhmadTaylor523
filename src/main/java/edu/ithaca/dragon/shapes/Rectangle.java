package edu.ithaca.dragon.shapes;

public class Rectangle {
    private double length;
    private double width;
    

    public Rectangle(double length, double width){
        if (length <=0 || width <= 0 ){
            throw new IllegalArgumentException("Can not be negative");
        }
        this.length = length;
        this.width = width;

       
    }

    public double calcArea(){
        return this.length * this.width;
       
    }

    public void doubleSize(){
        this.width *= 2;
        this.length *= 2;

        
    }

    public double longestLineWithin(){
        return Math.sqrt((this.length * this.length) + (this.width * this.width));
    }
    
}
