package Lesson1;

public class MobilePhones {
    private int batteryCharge;
    private boolean mobileCamera;
    private boolean wifiConnection;

    public int getBatteryCharge() {
        return batteryCharge;
    }

    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    public boolean isMobileCamera() {
        return mobileCamera;
    }

    public void setMobileCamera(boolean mobileCamera) {
        this.mobileCamera = mobileCamera;
    }

    public boolean isWifiConnection() {
        return wifiConnection;
    }

    public void setWifiConnection(boolean wifiConnection) {
        this.wifiConnection = wifiConnection;
    }

    public void goOnline(){
        setWifiConnection(true);
    }

    public void takePhoto(){
        setMobileCamera(true);
    }

    public void startCharging(){
        setBatteryCharge(getBatteryCharge() + 100);
    }

}



