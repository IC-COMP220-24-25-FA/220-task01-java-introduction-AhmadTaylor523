package edu.ithaca.dragon.shapes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class ShapeMain {

    public static void main(String[] args) {
        int times = 5;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        List<Shape> shapeList = new ArrayList<>();

        
        for (int i = 0; i < 10; i++) {
            int shapeType = random.nextInt(3); 
            if (shapeType == 0) {
                
                shapeList.add(new Rectangle(random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1));
            } else if (shapeType == 1) {
                
                shapeList.add(new Circle(random.nextDouble() * 10 + 1));
            } else {
                
                shapeList.add(new Triangle(random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1));
            }
        }

        
        System.out.println("Shapes before doubling:");
        for (Shape shape : shapeList) {
            System.out.println(shape);
        }

        
        for (Shape shape : shapeList) {
            shape.doubleSize();
        }

        System.out.println("\nShapes after doubling:");
        for (Shape shape : shapeList) {
            System.out.println(shape);
        }








        

        
        Rectangle myRectangle = new Rectangle(3, 4);
        Rectangle myRectangle2 = new Rectangle(5, 8);
        Rectangle myRectangle3 = new Rectangle(6, 7);
        Rectangle myRectangle4 = new Rectangle(2, 3);
        Rectangle myRectangle5 = new Rectangle(4, 9);

        
        List<Rectangle> rectangleList = new ArrayList<>();
        rectangleList.add(myRectangle);
        rectangleList.add(myRectangle2);
        rectangleList.add(myRectangle3);
        rectangleList.add(myRectangle4);
        rectangleList.add(myRectangle5);

        
        for (Rectangle rectangle : rectangleList) {
            System.out.println("Area: " + rectangle.calcArea() + ", Longest Line: " + rectangle.longestLineWithin());
        }

        
        while (times > 0) {
            System.out.print("Pick a Rectangle (0-4): ");
            int Rect = scanner.nextInt();

            
            if (Rect >= 0 && Rect <= 4) {
                rectangleList.get(Rect).doubleSize();

                
                for (Rectangle rectangle : rectangleList) {
                    System.out.println("Area: " + rectangle.calcArea() + ", Longest Line: " + rectangle.longestLineWithin());
                }
            } else {
                System.out.println("Invalid choice, please pick a number between 0 and 4.");
            }

            times -= 1;
        }

        scanner.close();
    }
}
