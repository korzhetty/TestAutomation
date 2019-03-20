package Lesson1;

public class AlcoholicBeverages {
    private int volumeOfAlcohol;
    private int calorie;
    private int temperature;

    public int getVolumeOfAlcohol() {
        return volumeOfAlcohol;
    }

    public void setVolumeOfAlcohol(int volumeOfAlcohol) {
        this.volumeOfAlcohol = volumeOfAlcohol;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void addVodka(){
        setVolumeOfAlcohol(getVolumeOfAlcohol() + 7);
    }

    public void addCoke(){
        setCalorie(getCalorie() + 100);
    }

    private void putIntoTheFridge(){
        setTemperature(getTemperature() -10);
    }

}