import org.junit.Before;
import org.junit.jupiter.api.Test;
import java.awt.Color;
import static org.junit.jupiter.api.Assertions.*;


public class ScaniaTest {

    @Test
    public void testFlak() {
        Scania car = new Scania();
        car.raiseFlak(50);
        car.lowerFlak(20);
        assertEquals(30, car.getAngle());
    }
    @Test
    public void testFlakMax() {
        Scania car = new Scania();
        car.raiseFlak(100);
        assertEquals(70, car.getAngle());
    }

    @Test
    public void testFlakMin() {
        Scania car = new Scania();
        car.raiseFlak(70);
        car.lowerFlak(80);
        assertEquals(0, car.getAngle());
    }
    @Test
    public void testStart() {
        Scania car = new Scania();
        car.raiseFlak(70);
        car.startEngine();
        car.gas(1);
        assertEquals(0, car.getCurrentSpeed());
    }

    @Test
    public void testGasAndStartEngine() {
        Scania car = new Scania();
        car.startEngine();
        car.gas(1);
        assertEquals(1.6, car.getCurrentSpeed());
    }
}