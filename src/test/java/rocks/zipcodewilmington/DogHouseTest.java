package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    /*@Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }*/

    // LOOK AT THESE TESTS AGAIN
    @Test
    public void testAdd() {
        Date date = new Date(2002, 2, 22);
        String name = "Ace";
        int id = 123;
        Dog dog = new Dog(name, date, id);

        DogHouse.clear();
        DogHouse.add(dog);
        Dog expectedDog = DogHouse.getDogById(id);

        System.out.println(DogHouse.getNumberOfDogs());

        Assert.assertEquals(expectedDog, dog);
    }

    @Test
    public void testRemoveDog(){
        Date date = new Date(2002, 2, 22);
        String name = "Ace";
        int id = 123;
        Dog dog = new Dog(name, date, id);

        DogHouse.clear();
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Dog expected = DogHouse.getDogById(id);

        Assert.assertNull(expected);
    }

    @Test
    public void testRemoveById(){
        Date date = new Date(2002, 2, 22);
        String name = "Ace";
        int id = 123;
        Dog dog = new Dog(name, date, id);

        DogHouse.clear();
        DogHouse.add(dog);
        DogHouse.remove(id);

        Assert.assertNull(DogHouse.getDogById(id));

    }

    @Test
    public void testGetDogById(){
        Date date = new Date(2002, 2, 22);
        String name = "Ace";
        int id = 123;
        Dog dog = new Dog(name, date, id);

        DogHouse.add(dog);
        Dog expected = DogHouse.getDogById(id);

        Assert.assertEquals(expected, dog );
    }

    @Test
    public void getNumberOfDogs(){
        Date date = new Date(2002, 2, 22);
        String name = "Ace";
        int id = 123;
        Dog dog = new Dog(name, date, id);
        Dog dog2 = new Dog(null, null, null);
        System.out.println(DogHouse.getNumberOfDogs());
        DogHouse.add(dog);
        DogHouse.add(dog2);

        int expected = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, (int) DogHouse.getNumberOfDogs());
    }
}
