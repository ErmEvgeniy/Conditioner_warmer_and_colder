package netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

public void shouldGetAndSet() {
    Conditioner conditioner = new Conditioner();
    String expected = "Кондишн";

    assertNull(conditioner.getName());
    conditioner.setName(expected);
    assertEquals(expected, conditioner.getName());
}

@Test
    public void testConditioner(){
    Conditioner conditioner = new Conditioner();
    conditioner.setMinTemperature(0);
    conditioner.setMaxTemperature(10);

    conditioner.setCurrentTemperature(5);
    assertEquals(5,conditioner.getCurrentTemperature());


    //увеличиваем температуру
    conditioner.increaseCurrentTemperature();
    assertEquals(6,conditioner.getCurrentTemperature());

    conditioner.increaseCurrentTemperature();
    assertEquals(7,conditioner.getCurrentTemperature());

    conditioner.increaseCurrentTemperature();
    assertEquals(8,conditioner.getCurrentTemperature());

    conditioner.increaseCurrentTemperature();
    assertEquals(9,conditioner.getCurrentTemperature());

    conditioner.increaseCurrentTemperature();
    assertEquals(10,conditioner.getCurrentTemperature());

    conditioner.increaseCurrentTemperature();
    assertEquals(10,conditioner.getCurrentTemperature());


    //уменьшаем температуру
    conditioner.decreaseCurrentTemperature();
    assertEquals(9,conditioner.getCurrentTemperature());

    conditioner.decreaseCurrentTemperature();
    assertEquals(8,conditioner.getCurrentTemperature());

    conditioner.decreaseCurrentTemperature();
    assertEquals(7,conditioner.getCurrentTemperature());

    conditioner.decreaseCurrentTemperature();
    assertEquals(6,conditioner.getCurrentTemperature());

    conditioner.decreaseCurrentTemperature();
    assertEquals(5,conditioner.getCurrentTemperature());

    conditioner.decreaseCurrentTemperature();
    assertEquals(4,conditioner.getCurrentTemperature());

    conditioner.decreaseCurrentTemperature();
    assertEquals(3,conditioner.getCurrentTemperature());

    conditioner.decreaseCurrentTemperature();
    assertEquals(2,conditioner.getCurrentTemperature());

    conditioner.decreaseCurrentTemperature();
    assertEquals(1,conditioner.getCurrentTemperature());

    conditioner.decreaseCurrentTemperature();
    assertEquals(0,conditioner.getCurrentTemperature());

    conditioner.decreaseCurrentTemperature();
    assertEquals(0,conditioner.getCurrentTemperature());

}
}