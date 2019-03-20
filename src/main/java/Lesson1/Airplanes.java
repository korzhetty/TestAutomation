package Lesson1;

public class Airplanes {
    private int airplaneModel;
    private int airplaneCapacity;
    private String airplanePilotName;
    private String airplaneType;
    private int airplaneSpeed;

    public int getAirplaneModel() {
        return airplaneModel;
    }

    public void setAirplaneModel(int airplaneModel) {
        this.airplaneModel = airplaneModel;
    }

    public int getAirplaneCapacity() {
        return airplaneCapacity;
    }

    public void setAirplaneCapacity(int airplaneCapacity) {
        this.airplaneCapacity = airplaneCapacity;
    }

    public String getAirplanePilotName() {
        return airplanePilotName;
    }

    public void setAirplanePilotName(String airplanePilotName) {
        this.airplanePilotName = airplanePilotName;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    private int getAirplaneSpeed() {
        return airplaneSpeed;
    }

    private void setAirplaneSpeed(int airplaneSpeed) {
        this.airplaneSpeed = airplaneSpeed;

    }

    private void stopThePlane() {
        setAirplaneSpeed(0);
    }

    public void accelerationEnable(){
        setAirplaneSpeed(getAirplaneSpeed() + 1000);
    }
}

