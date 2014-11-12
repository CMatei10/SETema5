package tema5.Factory;

import tema5.Interfaces.IAnimalFactory;

/**
 * Created by CristiaN1 on 11/12/2014.
 */
public class AbstractFactory {
    public IAnimalFactory returnFactory(String factory){
        if ("Dog".equalsIgnoreCase(factory)){

            return new DogFactory();
        }
        else{

            return new CatFactory();
        }
    }

}
