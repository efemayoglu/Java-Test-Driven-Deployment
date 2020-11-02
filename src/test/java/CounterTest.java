import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
    @org.junit.jupiter.api.Test

    public void testCreation(){
        Counter dog = new Counter(60);
        assertNotNull(dog);
    }
    @org.junit.jupiter.api.Test

    public void testGetValue(){
        int initialValue = 30;
        Counter dog = new Counter(initialValue);
        int value = dog.getValue();
        assertEquals(initialValue, value);

    }

    @org.junit.jupiter.api.Test

    public void testDecrement(){
        int initialValue = 60;
        Counter dog = new Counter(initialValue);
        for (int i=1; i<initialValue;i++){
            dog.decrement();
            int value = dog.getValue();
            assertEquals(initialValue-i, value);
        }
        int finalValue = dog.getValue();
        assertEquals(1, finalValue);


    }

    @org.junit.jupiter.api.Test
    public void testNotitfy(){
        int initialValue = 60;
        Counter dog = new Counter(initialValue);
        int value = dog.getValue();

        while (value >0){
            dog.decrement();
            value = dog.getValue();
        }
        int finalValue = dog.getValue();
        assertEquals(0, finalValue);


    }



    @org.junit.jupiter.api.Test
    public void testRegistaration(){
        Listener myListener = new Listener();
        int initialValue = 60;
        Counter dog = new Counter(initialValue);
       dog.register(myListener);

    }
}