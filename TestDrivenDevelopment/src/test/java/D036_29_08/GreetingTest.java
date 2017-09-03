package D036_29_08;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Miver on 2017-09-03.
 */
public class GreetingTest {
    private Greeting greeting;

    @Before
    public void initialize() {
        greeting = new Greeting();
    }

    @Test //Task 1
    public void shouldReturnGreeting() throws Exception {
        String name = greeting.greet("Jan");
        assertEquals("Hello, Jan", name);
    }

    @Test //Task 2
    public void shouldReturnGeneralGreetingWhenNameIsNull() {
        String greet = greeting.greet(null);
        assertEquals("Hello, my friend", greet);
    }

    @Test //Task 3
    public void shouldReturnScream() {
        String greet = greeting.greet("JAN");
        assertEquals("HELLO, JAN", greet);
    }

    @Test //Task 4
    public void shouldHandleTwoNames() {
        String[] names = {"Jan", "Ala"};
        String greet = greeting.greet(names);
        assertEquals("Hello, Jan and Ala", greet);
    }

    @Test //Task 5
    public void shouldReturnManyName() {
        String[] names = {"Piotr", "Ania", "Paulina"};
        String greet = greeting.greet(names);
        assertEquals("Hello, Piotr, Ania and Paulina", greet);
    }
}