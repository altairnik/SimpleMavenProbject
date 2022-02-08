package SimpleAnimals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.util.Arrays;

//GIVEN
//WHEN
//THEN
class DogTest {

    @Test
    public void checkDogSound(){
        //GIVEN
        Dog dog = new Dog("Hachi","pet","day", "waiting", 15,11);
        String expectedSound = "Dog says rah rah";
        //WHEN
        String actualSound = dog.makeSound();
        //THEN
        Assertions.assertEquals(expectedSound, actualSound);
    }
    @Test
    public void checkType() throws NoSuchFieldException {
        //GIVEN
        Dog dog = new Dog("Hachi","pet","day", "waiting", 15,11);
        String expectedName = "pet";
        //WHEN
        String actualName = dog.type;
        Field [] declaredFields = Dog.class.getFields();
        System.out.println(Arrays.asList(declaredFields));
        //THEN
        Assertions.assertEquals(expectedName, actualName);
    }
    @Test
    public void checkName() throws NoSuchFieldException {
        //GIVEN
        Dog dog = new Dog("Hachi","pet","day", "waiting", 15,11);
        String expectedName = "Hachi";
        //WHEN
        String actualName = dog.getClass().getName();
        //THEN
        Assertions.assertEquals(expectedName, actualName);
    }

}