package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void testSetBirthDate(){
        Dog dog = new Dog("Ace", null, 7);

        Date expected = new Date(2003, 12, 23);
        dog.setBirthDate(expected);

        Assert.assertEquals(expected, dog.getBirthDate());
    }

    @Test
    public void testSpeak(){
        Date date = new Date();
        Dog dog = new Dog("Ace", date, 7);

        String expected = "bark!";

        Assert.assertEquals(expected, dog.speak());
    }

    @Test
    public void testEat(){
        Date date = new Date();
        Dog dog = new Dog("Ace", date, 7);
        Food food = new Food();

        dog.eat(food);
        int expected = dog.getNumberOfMealsEaten();

        Assert.assertEquals(expected, (int) dog.getNumberOfMealsEaten());
    }

    @Test
    public void testGetId(){
        Dog dog = new Dog("Ace", null, 7);

        int expected = dog.getId();

        Assert.assertEquals(7, (int) dog.getId());
    }

    @Test
    public void testInstanceOfAnimal(){
        Date date = new Date();
        Dog dog = new Dog("Ace", date, 7);

        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void testInstanceOfMammal(){
        Date date = new Date();
        Dog dog = new Dog("Ace", date, 7);

        Assert.assertTrue(dog instanceof Mammal);
    }
}
