package tema5.Factory;

import tema5.Animals.Birmaneza;
import tema5.Animals.Siameza;
import tema5.Interfaces.IAnimal;
import tema5.Interfaces.IAnimalFactory;

/**
 * Created by CristiaN1 on 11/12/2014.
 */
public class CatFactory  implements IAnimalFactory{

    public IAnimal getAnimal(String animal) {
        if ( animal.equalsIgnoreCase("bir") )
            return new Birmaneza();
        else if ( animal.equalsIgnoreCase("sia") )
            return new Siameza();

        return null;
    }
}
