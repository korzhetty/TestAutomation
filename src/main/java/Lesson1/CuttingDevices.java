package Lesson1;

public class CuttingDevices {
   private int motorPower;
   private int bladeLenght;
   private int sharpeningAngle;
   private int numberOfNozzle;

    private int getBladeLenght() {
        return bladeLenght;
    }

    private void setBladeLenght(int bladeLenght) {
        this.bladeLenght = bladeLenght;
    }

    private int getMotorPower() {
        return motorPower;
    }

    private void setMotorPower(int motorPower) {
        this.motorPower = motorPower;
    }

    private int getNumberOfNozzle() {
        return numberOfNozzle;
    }

    private void setNumberOfNozzle(int numberOfNozzle) {
        this.numberOfNozzle = numberOfNozzle;
    }

    private int getSharpeningAngle() {
        return sharpeningAngle;
    }

    private void setSharpeningAngle(int sharpeningAngle) {
        this.sharpeningAngle = sharpeningAngle;
    }

    public void switchTheTurboMode(){
        setMotorPower(getMotorPower() * 2);
    }

    public void bladeBlant(){
        setBladeLenght(getBladeLenght() - 1);

    }

    public void removeNozzle(){
        setNumberOfNozzle(getNumberOfNozzle() - 1);
    }

    public void angleBlant(){
        setSharpeningAngle(getSharpeningAngle() - 1);
    }
}
