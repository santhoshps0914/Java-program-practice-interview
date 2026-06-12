package designpatterns.structural.decorator.concretedecorator;

import designpatterns.structural.decorator.component.IPizza;
import designpatterns.structural.decorator.decorator.PizzaDecorator;

public class OlivesTopping extends PizzaDecorator {
    
    public OlivesTopping(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Olives added";
    }


    @Override
    public double getCost() {
        return Math.floor(super.getCost() + 45.23);
    }
}
