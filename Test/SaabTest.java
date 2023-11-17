import org.junit.Before;
import org.junit.jupiter.api.Test;
import java.awt.Color;
import static org.junit.jupiter.api.Assertions.*;


public class SaabTest {

    @Test
    public void testGas() {

        Saab95 car = new Saab95();
        car.gas(0.5);
        assertEquals(0.625, car.getCurrentSpeed());
    }

    @Test
    public void testBrake() {

        Saab95 car = new Saab95();
        car.startEngine();
        car.brake(0.3);
        assertEquals(0, car.getCurrentSpeed());
    }

    @Test
    public void testGetNrDoors() {
        Saab95 car = new Saab95();
        assertEquals(2, car.getNrDoors());
    }

    @Test
    public void testGetEnginePower() {
        Saab95 car = new Saab95();
        assertEquals(125, car.getEnginePower());
    }

    @Test
    public void testGetCurrentSpeed() {
        Saab95 car = new Saab95();
        car.startEngine();
        assertEquals(0.1, car.getCurrentSpeed());
    }

    @Test
    public void testGetColor() {
        Saab95 car = new Saab95();
        assertEquals(Color.RED, car.getColor());
    }

    @Test
    public void testSetColor() {
        Saab95 car = new Saab95();
        car.setColor(Color.BLACK);
        assertEquals(Color.BLACK, car.getColor());
    }

    @Test
    public void testStartEngine() {
        Saab95 car = new Saab95();
        car.startEngine();
        assertEquals(0.1, car.getCurrentSpeed());
    }

    @Test
    public void testStopEngine() {
        Saab95 car = new Saab95();
        car.startEngine();
        car.stopEngine();
        assertEquals(0, car.getCurrentSpeed());
    }

    @Test
    public void testMove() {
        Saab95 car = new Saab95();
        car.startEngine();
        car.move();
        assertEquals(0.1, car.getY());
    }

    @Test
    public void testTurnLeft() {
        Saab95 car = new Saab95();
        car.turnLeft();
        assertEquals(3, car.getDirection());
    }

    @Test
    public void testTurnRight() {
        Saab95 car = new Saab95();
        car.turnRight();
        assertEquals(1, car.getDirection());
    }

    @Test
    public void testTurboOn() {
        Saab95 car = new Saab95();
        car.setTurboOn();
        assertEquals(true, car.getTurbo());

    }

    @Test
    public void testTurboOff() {
        Saab95 car = new Saab95();
        car.setTurboOn();
        car.setTurboOff();
        assertEquals(false, car.getTurbo());
    }
}