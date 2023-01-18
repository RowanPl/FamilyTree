import org.example.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

@Test
    public void getNameReturnsName(){
    //Arrange
    Person J = new Person("John", "Hendriks" , "Male", 30 );
    //Act
   String actual = J.getName();
    //Assert
    assertEquals("John", actual);
}
@Test
    public void addChildToChildrenList(){
    Person person = new Person("Jantje", "Pietersma" , "male", 30);
    Person child = new Person("Jan", "Pietersma", "Male" ,12);

    person.addChild(child);
    List<Person> expected = person.getChildren();
    assertEquals(List.of(child), expected );
    }


}
