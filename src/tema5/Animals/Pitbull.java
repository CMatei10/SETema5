package tema5.Animals;

import tema5.Interfaces.IAnimal;

/**
 * Created by CristiaN1 on 11/12/2014.
 */
public class Pitbull implements IAnimal {

    @Override
    public void speak() {
        System.out.println("The Pitbull says  \"WOOF!\"");
    }
}
