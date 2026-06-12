package designpatterns.structural.decorator.decorator;

import designpatterns.structural.decorator.component.IPizza;

public abstract class PizzaDecorator implements IPizza {

    
    private final IPizza pizza;

    protected PizzaDecorator(IPizza pizza) {
        this.pizza = pizza;
    }


    @Override
    public double getCost() {
        return pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
}
