package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateDog(){
        Date date = new Date(2015, 1, 25);
        String name = "Dasi";
        Dog dog = AnimalFactory.createDog(name, date);

        Assert.assertEquals(name, dog.getName());
        Assert.assertEquals(date, dog.getBirthDate());

    }

    @Test
    public void testCreateCat(){
        Date date = new Date(2002, 2, 22);
        String name = "Ace";
        Cat cat = AnimalFactory.createCat(name, date);

        Assert.assertEquals(name, cat.getName());
        Assert.assertEquals(date, cat.getBirthDate());
    }
}
