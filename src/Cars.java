import java.awt.*;
public abstract class Cars implements Movable {

    protected int nrDoors;
    protected double enginePower;
    protected double currentSpeed;
    protected Color color;
    protected String modelName;
    protected int direction;
    protected double x;
    protected double y;
    protected double carLength;
    protected boolean isLoaded = false;
    protected int getNrDoors() {
        return nrDoors;
    }
    protected int getDirection(){
        return direction;
    }
    protected double getEnginePower() {
        return enginePower;
    }
    protected double getY(){
        return y;
    }
    protected double getX(){
        return x;
    }
    protected double getCurrentSpeed() {
        return currentSpeed;
    }
    protected Color getColor() {
        return color;
    }
    protected double getCarLength() {
        return carLength;
    }

    protected void setX(double X) {x = X;}
    protected void setY(double Y) {y = Y;}
    protected void setColor(Color clr) {
        color = clr;
    }

    protected void startEngine() { currentSpeed = 0.1; }

    protected void stopEngine() {
        currentSpeed = 0;
    }



    protected void gas(double amount) {
        if (0 <= amount && amount <= 1) {
            incrementSpeed(amount);
        }
    }

    protected abstract double speedFactor();


    protected void brake(double amount) {
        if (0 <= amount && amount <= 1) {
            decrementSpeed(amount);
        }
    }


    protected void incrementSpeed(double amount) {
        currentSpeed = Math.min(getCurrentSpeed() + this.speedFactor() * amount, enginePower);
    }

    protected void decrementSpeed(double amount) {
        currentSpeed = Math.max(getCurrentSpeed() - this.speedFactor() * amount, 0);
    }

    public void move() {
        if (direction == 0) {
            y += currentSpeed;
        } else if (direction == 1) {
            x += currentSpeed;
        } else if (direction == 2) {
            y -= currentSpeed;
        } else if (direction == 3) {
            x -= currentSpeed;
        }
    }

    public void turnLeft() {
        direction = (direction +3) %4;
    }

    public void turnRight() {
        direction = (direction +1) %4;
    }
}