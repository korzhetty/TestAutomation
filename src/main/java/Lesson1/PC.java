package Lesson1;

public class PC {
    private int brightness;
    private int memorySize;
    private boolean networkConnection;

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public boolean isNetworkConnection() {
        return networkConnection;

    }

    public void setNetworkConnection(boolean networkConnection) {
        this.networkConnection = networkConnection;
    }

    public void installTheApplication(){
        setMemorySize(getMemorySize() - 1000);
    }

    private void connectToNetwork(){
        setNetworkConnection(true);
    }

    public void changeBrightnesToMax(){
        setBrightness(getBrightness() + 100);
    }

}