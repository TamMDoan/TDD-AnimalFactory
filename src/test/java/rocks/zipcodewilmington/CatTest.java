package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;
import java.util.Optional;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSetName(){
        Date date = new Date();
        Cat testCat = new Cat("Ace", date, 7);

        testCat.setName("newName");

        Assert.assertEquals("newName", testCat.getName());
    }

    @Test
    public void testSetBirthDate(){
        Date date = new Date();
        Cat cat = new Cat("Ace", date, 7);

        Date expected = new Date(2003, 12, 23);
        cat.setBirthDate(expected);

        Assert.assertEquals(expected, cat.getBirthDate());
    }

    @Test
    public void testSpeak(){
        Date date = new Date();
        Cat cat = new Cat("Ace", date, 7);

        String expected = "meow!";

        Assert.assertEquals(expected, cat.speak());
    }

    @Test
    public void testEat(){
        Date date = new Date();
        Cat cat = new Cat("Ace", date, 7);
        Food food = new Food();

        cat.eat(food);
        int expected = cat.getNumberOfMealsEaten();

        Assert.assertEquals(1, (int) cat.getNumberOfMealsEaten());
    }

    @Test
    public void testGetId(){
        Date date = new Date();
        Cat cat = new Cat("Ace", date, 7);

        int expected = cat.getId();

        Assert.assertEquals(7, (int) cat.getId());
    }

    @Test
    public void testInstanceOfAnimal(){
        Date date = new Date();
        Cat cat = new Cat("Ace", date, 7);

        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void testInstanceOfMammal(){
        Date date = new Date();
        Cat cat = new Cat("Ace", date, 7);

        Assert.assertTrue(cat instanceof Mammal);
    }

}
