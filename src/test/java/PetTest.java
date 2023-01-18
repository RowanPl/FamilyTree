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
}
