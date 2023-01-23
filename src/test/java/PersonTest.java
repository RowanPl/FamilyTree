import org.example.Person;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {

    @Test
    public void getNameReturnsName() {
        //Arrange
        Person J = new Person("John", "Hendriks", "Male", 30);
        //Act
        String actual = J.getName();
        //Assert
        assertEquals("John", actual);
    }

    @Test
    public void addChildToChildrenList() {
        Person person = new Person("Jantje", "Pietersma", "male", 30);
        Person child = new Person("Jan", "Pietersma", "Male", 12);

        person.addChild(child);
        List<Person> expected = person.getChildren();
        assertEquals(List.of(child), expected);
    }

    @Test
    public void returnMiddleName() {
        Person person = new Person("Jan", "Henk", "Pieterman", "Male", 31);
        String middleName = person.getMiddleName();
        assertEquals("Henk", middleName);
    }

    @Test
    public void returnLastName() {
        Person person = new Person("Jan",  "Pieterman", "Male", 31);
        String lastName = person.getLastName();
        assertEquals("Pieterman", lastName);

    }

    @Test
    public void returnSex() {
        Person person = new Person("Jan", "Henk", "Pieterman", "Male", 31);
        String expectedSex = person.getSex().toLowerCase();
        assertEquals("male", expectedSex);

    }
    @Test
    public void returnAge() {
        Person person = new Person("Jan", "Henk", "Pieterman", "Male", 31);
        int expectedAge = person.getAge();
        assertEquals(31, expectedAge);

    }

    @Test
    public void shouldAddMiddleName() {
        Person person = new Person("Jan",  "Pieterman", "Male", 31);
        person.setMiddleName("Jeremy");
        String expectedMiddleName = person.getMiddleName();
        assertEquals("Jeremy", expectedMiddleName);

    }



    @Test
    void getGrandChildren() {
//        Arrange

        Person parent = new Person("Jaqueline", "Pietersen",  "female", 64);
        Person child1 = new Person("Mike", "Pietersen",  "male", 40);
        Person child2 = new Person("Jan", "Pietersen",  "male", 40);

        Person grandChild1 = new Person("Klaas", "Pietersen", "male", 13);
        Person grandChild2 = new Person("Feline", "Pietersen", "female", 13);
        Person grandChild3 = new Person("Adriaantje", "Pietersen", "male", 13);


        // Assign children and grandchildren
        parent.addChild(child1);
        parent.addChild(child2);
        child1.addGrandChildren(grandChild1);
        child1.addGrandChildren(grandChild2);
        child2.addGrandChildren(grandChild3);

        // Call addGrandChildren() method
        List<Person> grandChildren = parent.addGrandChildren(grandChild1);
        grandChildren.add(grandChild1);
        grandChildren.add(grandChild2);
        grandChildren.add(grandChild3);
        // Create expected list of grandchildren
        List<Person> expectedGrandChildren = new ArrayList<>();
        expectedGrandChildren.add(grandChild1);
        expectedGrandChildren.add(grandChild2);
        expectedGrandChildren.add(grandChild3);

        // Compare the returned list to the expected list
        assertEquals(List.of(expectedGrandChildren),List.of(grandChildren));
    }
}
