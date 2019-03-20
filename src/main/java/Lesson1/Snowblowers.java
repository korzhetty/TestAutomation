package Lesson1;

public class Snowblowers {
    private int snowblowersSpeed;
    private boolean snowBlowersHeadlight;
    private boolean Petrol;

    public int getSnowblowersSpeed() {
        return snowblowersSpeed;
    }

    public void setSnowblowersSpeed(int snowblowersSpeed) {
        this.snowblowersSpeed = snowblowersSpeed;
    }

    public boolean isPetrol() {
        return Petrol;
    }

    public void setPetrol(boolean petrol) {
        Petrol = petrol;
    }

    public boolean isSnowBlowersHeadlight() {
        return snowBlowersHeadlight;
    }

    public void setSnowBlowersHeadlight(boolean snowBlowersHeadlight) {
        this.snowBlowersHeadlight = snowBlowersHeadlight;
    }

    public void goFast() {
        setSnowblowersSpeed(getSnowblowersSpeed() + 50);
    }

    private void turnOnTheHeadLights() {
        setSnowBlowersHeadlight(true);
    }

    private void turnOffTheHeadLights() {
        setSnowBlowersHeadlight(false);
    }

    public void stop() {
        setSnowblowersSpeed (0);
    }

    public void startClean(){
        setPetrol(true);
    }

}
