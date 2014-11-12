package tema5;

import tema5.Factory.AbstractFactory;
import tema5.Interfaces.IAnimal;
import tema5.Interfaces.IAnimalFactory;

/**
 * Created by CristiaN1 on 11/12/2014.
 */
public class main {
    public static void main(String[] args) {
        // Concrete factory instance

        AbstractFactory abstractFactory = new AbstractFactory();

        // Product Factory Objects

        IAnimalFactory animalFactory1 = abstractFactory.returnFactory("Dog");
        IAnimal dog1 = animalFactory1.getAnimal("fight");
        IAnimal dog2 = animalFactory1.getAnimal("friend");
        IAnimalFactory animalFactory2 = abstractFactory.returnFactory("Cat");
        IAnimal cat1 = animalFactory2.getAnimal("bir");
        IAnimal cat2 = animalFactory2.getAnimal("sia");
    }
}
