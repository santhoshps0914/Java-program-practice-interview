package designpatterns.structural.decorator.client;

import designpatterns.structural.decorator.component.IPizza;
import designpatterns.structural.decorator.concretecomponent.MargheritaPizza;
import designpatterns.structural.decorator.concretedecorator.JalapenosTopping;
import designpatterns.structural.decorator.concretedecorator.OlivesTopping;

public class PizzaHutMain {

    public static void main(String[] args) {

        IPizza pizza = new MargheritaPizza();

        System.out.println(pizza.getDescription()+" with cost in $ "+pizza.getCost());
        
        pizza = new JalapenosTopping(pizza);

        System.out.println(pizza.getDescription()+" with cost in $ "+pizza.getCost());

        pizza = new OlivesTopping(pizza);
        
        pizza = new JalapenosTopping(pizza);

        System.out.println(pizza.getDescription()+" with cost in $ "+pizza.getCost());
        
        
    }
    
    
}
