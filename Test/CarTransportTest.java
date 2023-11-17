import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTransportTest {
    private CarTransport carTransport;
    private Cars car;

    @BeforeEach
    public void setUp() {
        carTransport = new CarTransport();
        car = new Volvo240();
    }

    @Test
    public void testLoadCar() {
        carTransport.lowerRamp();
        carTransport.loadCar(car);
        assertEquals(1, carTransport.getLoadedCars().size());
        assertEquals(carTransport.getX(), car.getX());
        assertEquals(carTransport.getY(), car.getY());
    }

    @Test
    public void testUnloadCar() {
        carTransport.lowerRamp();
        carTransport.loadCar(car);
        carTransport.unloadCar(car);
        assertEquals(0, carTransport.getLoadedCars().size());
        assertEquals(carTransport.getX() + 1, car.getX());
        assertEquals(carTransport.getY() + 1, car.getY());
    }

    @Test
    public void testMove() {
        carTransport.lowerRamp();
        carTransport.loadCar(car);
        carTransport.move();
        assertEquals(carTransport.getX(), car.getX());
        assertEquals(carTransport.getY(), car.getY());
    }

    @Test
    public void testRaiseRamp() {
        carTransport.raiseRamp();
        carTransport.loadCar(car);
        assertEquals(0, carTransport.getLoadedCars().size());
    }

    @Test
    public void testLowerRamp() {
        carTransport.lowerRamp();
        carTransport.loadCar(car);
        assertEquals(1, carTransport.getLoadedCars().size());
    }

    @Test
    public void testLowerRampStart() {
        CarTransport car = new CarTransport();
        car.lowerRamp();
        car.startEngine();
        car.gas(1);
        assertEquals(0, car.getCurrentSpeed());
    }

    @Test
    public void testStartAndGas() {
        CarTransport car = new CarTransport();
        car.startEngine();
        car.gas(1);
        assertEquals(1.6, car.getCurrentSpeed());
    }

    @Test
    public void testLoadTruck() {
        Scania truck = new Scania();
        CarTransport transport = new CarTransport();
        carTransport.lowerRamp();
        carTransport.loadCar(truck);
        carTransport.loadCar(transport);
        assertEquals(true, carTransport.getLoadedCars().isEmpty());
    }

    @Test
    public void testLoadTwoTimes() {
        carTransport.lowerRamp();
        carTransport.loadCar(car);
        carTransport.loadCar(car);
        assertEquals(1, carTransport.getLoadedCars().size());
    }
}