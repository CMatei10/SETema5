package tema5.Factory;

import tema5.Animals.Husky;
import tema5.Animals.Pitbull;
import tema5.Interfaces.IAnimal;
import tema5.Interfaces.IAnimalFactory;

/**
 * Created by CristiaN1 on 11/12/2014.
 */
public class DogFactory  implements IAnimalFactory{


    public IAnimal getAnimal(String criteria)
    {
        if ( criteria.equals("fight") )
            return new Pitbull();
        else if ( criteria.equals("friend") )
            return new Husky();

        return null;
    }
}
