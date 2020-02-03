package com.training.LSP;

public class LSPDemo {

    public static void useIt(Rectangle rectangle) {
        int width = rectangle.getWidth();
        rectangle.setHeight(10);

        System.out.println("Actual Area : " + rectangle.getArea());
        System.out.println("Expected Area : " + width * 10);

    }

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(2, 3);
        LSPDemo.useIt(rectangle);

        Rectangle square = new Square(2, 3);
        LSPDemo.useIt(square);

    }
}
