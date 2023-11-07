package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testAdd() {
        Date date = new Date(2002, 2, 22);
        String name = "Ace";
        int id = 123;
        Cat cat = new Cat(name, date, id);

        CatHouse.clear();
        CatHouse.add(cat);
        Cat expectedCat = CatHouse.getCatById(id);

        Assert.assertEquals(expectedCat, cat);
    }

    @Test
    public void testRemoveCat(){
        Date date = new Date(2002, 2, 22);
        String name = "Ace";
        int id = 123;
        Cat cat = new Cat(name, date, id);

        CatHouse.clear();
        CatHouse.add(cat);
        CatHouse.remove(cat);
        Cat expected = CatHouse.getCatById(id);

        Assert.assertNull(expected);
    }

    @Test
    public void testRemoveById(){
        Date date = new Date(2002, 2, 22);
        String name = "Ace";
        int id = 123;
        Cat cat = new Cat(name, date, id);

        CatHouse.clear();
        CatHouse.remove(id);

        Assert.assertNull(CatHouse.getCatById(id));

    }

    @Test
    public void testGetCatById(){
        Date date = new Date(2002, 2, 22);
        String name = "Ace";
        int id = 123;
        Cat cat = new Cat(name, date, id);

        CatHouse.clear();
        CatHouse.add(cat);
        Cat expected = CatHouse.getCatById(id);

        Assert.assertEquals(expected, cat );
    }

    @Test
    public void getNumberOfCats(){
        Date date = new Date(2002, 2, 22);
        String name = "Ace";
        int id = 123;
        Cat cat = new Cat(name, date, id);
        Cat cat2 = new Cat(null, null, null);

        CatHouse.add(cat);
        CatHouse.add(cat2);

        int expected = 2;

        Assert.assertEquals(expected, (int) CatHouse.getNumberOfCats());
    }
}
