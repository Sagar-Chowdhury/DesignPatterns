package DesignPatterns.FactoryPattern;

public class MainClass {

    public static void main(String[] args)
    {
        ShapeFactory shapeFactoryobj =new ShapeFactory();
        Shape shapeobj = shapeFactoryobj.getShape("Circle");
        shapeobj.draw();

    }

}
