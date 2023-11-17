import java.awt.*;

public class Scania extends Cars{
    public Scania(){
        nrDoors = 2;
        color = Color.yellow;
        enginePower = 150;
        modelName = "Scania";
        carLength = 15;
        stopEngine();
    }
    protected double speedFactor() {
        if (angle != 0)
            return 0;
        else
            return enginePower * 0.01;
    }
    private int angle = 0;

    protected void startEngine() {
        if (angle == 0)
            currentSpeed = 0.1;
    }

    protected void raiseFlak(int raiseBy){
        if (currentSpeed == 0) {
            angle += raiseBy;
            if (angle > 70) {
                angle = 70;
            }
        }
    }
    protected void lowerFlak(int lowerBy){
        if (currentSpeed == 0) {
            angle -= lowerBy;
            if (angle < 0) {
                angle = 0;
            }
        }
    }
    protected int getAngle() {
        return angle;
    }
}