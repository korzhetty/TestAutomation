package Lesson1;

public class Foods {
    private int foodsCalories;
    private int foodsFats;
    private int foodsCarbohydrate;
    private boolean Vegan;

    public int getFoodsCalories() {
        return foodsCalories;
    }

    public void setFoodsCalories(int foodsCalories) {
        this.foodsCalories = foodsCalories;
    }

    public int getFoodsFats() {
        return foodsFats;
    }

    public void setFoodsFats(int foodsFats) {
        this.foodsFats = foodsFats;
    }

    public int getFoodsCarbohydrate() {
        return foodsCarbohydrate;
    }

    public void setFoodsCarbohydrate(int foodsCarbohydrate) {
        this.foodsCarbohydrate = foodsCarbohydrate;
    }

    public boolean isVegan() {
        return Vegan;
    }

    public void setVegan(boolean vegan) {
        Vegan = vegan;
    }

    public void addTheOil(){
        setFoodsFats(getFoodsFats() + 100);
        setFoodsCalories(getFoodsCalories() + 50);
    }

    private void eatWithBread(){
        setFoodsCarbohydrate(getFoodsCarbohydrate() + 50);
        setFoodsCalories(getFoodsCalories() + 100);
    }

    private void addEcoSticker(){
        setVegan(true);

    }

}
