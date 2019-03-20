package Lesson1;

public class Drones {

    private int dronesSpeed;
    private int dronesHeight;
    private boolean VideoCamera;

    public int getDronesSpeed() {
        return dronesSpeed;
    }

    public void setDronesSpeed(int dronesSpeed) {
        this.dronesSpeed = dronesSpeed;
    }

    public int getDronesHeight() {
        return dronesHeight;
    }

    public void setDronesHeight(int dronesHeight) {
        this.dronesHeight = dronesHeight;
    }

    public boolean isVideoCamera() {
        return VideoCamera;
    }

    public void setVideoCamera(boolean videoCamera) {
        VideoCamera = videoCamera;
    }

    public void startVideoRecording(){
        setVideoCamera(true);
    }

    private void toFall() {
        setDronesHeight(0);
    }

    public void startFlying(){
        setDronesSpeed(getDronesSpeed() + 100);
    }

}
