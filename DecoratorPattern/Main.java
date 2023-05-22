package DesignPatterns.DecoratorPattern;

// Component interface
interface Pizza {
    String getDescription();
    double getCost();
}

// Concrete component class
class BasicPizza implements Pizza {
    public String getDescription() {
        return "Basic Pizza";
    }

    public double getCost() {
        return 8.99;
    }
}

// Decorator abstract class
abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription();
    }

    public double getCost() {
        return pizza.getCost();
    }
}

// Concrete decorator classes
class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    public double getCost() {
        return pizza.getCost() + 1.99;
    }
}

class PepperoniDecorator extends PizzaDecorator {
    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Pepperoni";
    }

    public double getCost() {
        return pizza.getCost() + 2.49;
    }
}

public class Main {
    public static void main(String[] args) {
        // Ordering a basic pizza
        Pizza basicPizza = new BasicPizza();
        System.out.println("Description: " + basicPizza.getDescription());
        System.out.println("Cost: $" + basicPizza.getCost());

        // Adding cheese to the basic pizza
        Pizza cheesePizza = new CheeseDecorator(basicPizza);
        System.out.println("Description: " + cheesePizza.getDescription());
        System.out.println("Cost: $" + cheesePizza.getCost());

        // Adding pepperoni to the basic pizza
        Pizza pepperoniPizza = new PepperoniDecorator(basicPizza);
        System.out.println("Description: " + pepperoniPizza.getDescription());
        System.out.println("Cost: $" + pepperoniPizza.getCost());

        // Adding cheese and pepperoni to the basic pizza
        Pizza deluxePizza = new PepperoniDecorator(new CheeseDecorator(basicPizza));
        System.out.println("Description: " + deluxePizza.getDescription());
        System.out.println("Cost: $" + deluxePizza.getCost());
    }
}

// Explanation := In this example, we have a Pizza interface that represents the basic pizza. The BasicPizza class implements this interface, providing the base functionality.
//
// The PizzaDecorator class is an abstract class that serves as the base decorator. It implements the Pizza interface and holds a reference to another Pizza object. It provides a common implementation for the getDescription() and getCost() methods by delegating the calls to the wrapped object.
//
//The CheeseDecorator and PepperoniDecorator classes are concrete decorators. They extend the PizzaDecorator class and add their own functionality by overriding the getDescription() and getCost() methods. These decorators wrap the existing pizza object and provide additional features.
//
//In the Main class, we demonstrate the usage of decorators. We start with a basic pizza, and then we create different combinations by adding decorators such as cheese, pepperoni, or both. Each decorator modifies the description and cost of the pizza accordingly.
//
//When running the code, we can see how the decorators dynamically add new features to the pizza object without altering the behavior of the original object. This allows us to customize the pizza with different toppings and calculate the total cost based on the added decorators.
//
//The Decorator pattern is beneficial when you need to add or modify the behavior of an object dynamically at runtime without the need to create multiple subclasses. It provides a flexible and scalable way to extend the functionality of objects in a modular and maintainable manner.