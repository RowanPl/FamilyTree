import org.example.Person;
import org.example.Pet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetTest {


    @Test
    public void addPetReturnName(){
        //Arrange
        Pet i = new  Pet("Henk", 23, "Dog");
        //Act
        String actual = i.getName();
        //Assert
        assertEquals("Henk", actual);


    }
    @Test
    public void shouldReturnPetAge(){
        Pet i = new Pet("Klaas", 12 ,"Mongoose");
        int expectedAge = i.getAge();
        assertEquals(12, expectedAge);
    }
    @Test
    public void shouldReturnPetSpecies(){
        Pet i = new Pet("Hendrik", 1 ,"Mongoose");
        String expectedSpecies = i.getSpecies();
        assertEquals("Mongoose", expectedSpecies);
    }



}
