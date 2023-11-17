import org.junit.jupiter.api.Test;
import java.awt.Color;
import static org.junit.jupiter.api.Assertions.*;


public class VolvoTest {
    @Test
    public void testGas() {

        Volvo240 car = new Volvo240();
        car.gas(0.5);
        assertEquals(0.625, car.getCurrentSpeed());
    }
    @Test
    public void testBrake() {

        Volvo240 car = new Volvo240();
        car.startEngine();
        car.brake(0.3);
        assertEquals(0, car.getCurrentSpeed());
    }
    @Test
    public void testGetNrDoors() {
        Volvo240 car = new Volvo240();
        assertEquals(4, car.getNrDoors());
    }

    @Test
    public void testGetEnginePower() {
        Volvo240 car = new Volvo240();
        assertEquals(100, car.getEnginePower());
    }

    @Test
    public void testGetCurrentSpeed() {
        Volvo240 car = new Volvo240();
        car.startEngine();
        assertEquals(0.1, car.getCurrentSpeed());
    }

    @Test
    public void testGetColor() {
        Volvo240 car = new Volvo240();
        assertEquals(Color.BLACK, car.getColor());
    }

    @Test
    public void testSetColor() {
        Volvo240 car = new Volvo240();
        car.setColor(Color.RED);
        assertEquals(Color.RED, car.getColor());
    }

    @Test
    public void testStartEngine() {
        Volvo240 car = new Volvo240();
        car.startEngine();
        assertEquals(0.1, car.getCurrentSpeed());
    }

    @Test
    public void testStopEngine() {
        Volvo240 car = new Volvo240();
        car.startEngine();
        car.stopEngine();
        assertEquals(0, car.getCurrentSpeed());
    }
    @Test
    public void testMove() {
        Volvo240 car = new Volvo240();
        car.startEngine();
        car.move();
        assertEquals(0.1, car.getY());
    }
    @Test
    public void testMoveX() {
        Saab95 car = new Saab95();
        car.startEngine();
        car.turnRight();
        car.move();
        car.turnRight();
        car.move();
        car.turnRight();
        car.move();
        car.turnRight();
        car.move();
        car.turnRight();
        car.move();
        assertEquals(0.1, car.getX());
    }

    @Test
    public void testTurnLeft() {
        Volvo240 car = new Volvo240();
        car.turnLeft();
        assertEquals(3, car.getDirection());
    }

    @Test
    public void testTurnRight() {
        Volvo240 car = new Volvo240();
        car.turnRight();
        assertEquals(1, car.getDirection());
    }

}