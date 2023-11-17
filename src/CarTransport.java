import java.awt.*;
import java.util.ArrayList;

public class CarTransport extends Cars{
    public CarTransport(){
        nrDoors = 2;
        color = Color.red;
        enginePower = 150;
        modelName = "CarTransport";
        carLength = 20;
        stopEngine();
    }
    protected double speedFactor() {
        if (rampDown)
            return 0;
        else
            return enginePower * 0.01;
    }
    private boolean rampDown = false;
    private ArrayList<Cars> loadedCars = new ArrayList<>();
    private final int maxCars = 3;
    private final double maxSize = 5.0;

    protected ArrayList<Cars> getLoadedCars() {return loadedCars;}

    protected void startEngine() {
        if (!rampDown)
            currentSpeed = 0.1;
    }

    public void lowerRamp() {
        if (currentSpeed == 0) {
            rampDown = true;
        }
    }
    public void raiseRamp() {
        rampDown = false;
    }
    public void loadCar(Cars car) {
        if (rampDown
                && !car.isLoaded
                && car.getCarLength() <= maxSize
                && loadedCars.size() < maxCars
                && Math.abs(car.getX() - getX()) < 1
                && Math.abs(car.getY() - getY()) < 1) {
            loadedCars.add(car);
            car.setX(x);
            car.setY(y);
            car.isLoaded = true;
        }
    }
    public void unloadCar(Cars car) {
        if (rampDown
                && !loadedCars.isEmpty()
                && car == loadedCars.get(loadedCars.size() - 1)) {
            loadedCars.remove(loadedCars.size() - 1);
            car.setX(x + 1);
            car.setY(y + 1);
            car.isLoaded = false;
        }
    }
    public void move() {
        super.move();
        for (Cars car : loadedCars) {
            car.setX(x);
            car.setY(y);
        }
    }
}