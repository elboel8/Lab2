import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GarageTest {

    @Test
    public void testAddRemoveCar() {
        Garage<Volvo240> volvoGarage = new Garage<>(10);
        Volvo240 volvo1 = new Volvo240();
        Volvo240 volvo2 = new Volvo240();
        volvoGarage.addCar(volvo1);
        volvoGarage.addCar(volvo2);
        volvoGarage.removeCar(volvo1);

        assertEquals(1, volvoGarage.getGarageCars().size());
    }
    @Test
    public void testGarage() {
        Garage<Cars> volvoGarage = new Garage<>(10);
        Volvo240 volvo = new Volvo240();
        Saab95 saab = new Saab95();
        volvoGarage.addCar(volvo);
        volvoGarage.addCar(saab);

        assertEquals(2, volvoGarage.getGarageCars().size());
    }
    @Test
    public void testCapacity() {
        Garage<Saab95> saabGarage = new Garage<>(1);
        Saab95 saab1 = new Saab95();
        Saab95 saab2 = new Saab95();
        saabGarage.addCar(saab1);
        saabGarage.addCar(saab2);

        assertEquals(1, saabGarage.getGarageCars().size());
    }
}