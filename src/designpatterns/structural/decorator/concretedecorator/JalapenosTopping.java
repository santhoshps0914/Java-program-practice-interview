package designpatterns.structural.decorator.concretedecorator;

import designpatterns.structural.decorator.component.IPizza;
import designpatterns.structural.decorator.decorator.PizzaDecorator;

public class JalapenosTopping extends PizzaDecorator {
    public JalapenosTopping(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Jalapenos added";
    }


    @Override
    public double getCost() {
        return Math.floor(super.getCost() + 35.0);
    }
}
