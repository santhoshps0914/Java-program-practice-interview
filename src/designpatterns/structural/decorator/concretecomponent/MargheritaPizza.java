package designpatterns.structural.decorator.concretecomponent;

import designpatterns.structural.decorator.component.IPizza;

public class MargheritaPizza implements IPizza {
    @Override
    public String getDescription() {
        return "Margherita Pizza is so yummy, delicious";
    }

    @Override
    public double getCost() {
        return 250.98;
    }
}
