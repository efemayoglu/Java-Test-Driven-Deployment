import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @org.junit.jupiter.api.Test
    public void testCreation(){
        Counter dog = new Counter();
        assertNotNull(dog);


    }
    @org.junit.jupiter.api.Test
    public void testGetValue(){
        int initialValue = 30;
        Counter dog = new Counter();
        int value = dog.getValue();
        assertEquals(value, 60);

    }
}