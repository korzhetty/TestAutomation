package Lesson1;

public class SlidingWardrobes {
    private int numberOfShelves;
    private boolean backLights;

    public int getNumberOfShelves() {
        return numberOfShelves;
    }

    public void setNumberOfShelves(int numberOfShelves) {
        this.numberOfShelves = numberOfShelves;
    }

    public boolean isBackLights() {
        return backLights;
    }

    public void setBackLights(boolean backLights) {
        this.backLights = backLights;
    }

    public void turnTheBackLights(){
        setBackLights(true);
 }
    private void breakTheShelf(){
        setNumberOfShelves(getNumberOfShelves() -1);
    }

}