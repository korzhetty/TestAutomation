package Lesson1;

public class FluorescentLights {
    private int numberOfLamps;
    private boolean Working;
    private int Brightness;

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public void setNumberOfLamps(int numberOfLamps) {
        this.numberOfLamps = numberOfLamps;
    }

    public int getBrightness() {
        return Brightness;
    }

    public void setBrightness(int brightness) {
        Brightness = brightness;
    }

    public boolean isWorking() {
        return Working;
    }

    public void setWorking(boolean working) {
        Working = working;
    }

    public void burnOut() {
        setWorking(false);
    }

    public void toCrack(){
        setWorking(false);
    }

    private void turnOff(){
        setBrightness(0);
    }

    private void removeTheLamp(){
        setNumberOfLamps(getNumberOfLamps() - 1);
    }
}
