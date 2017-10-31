package Food;

public class Food {
    private int id, foodgroup;
    private String name;
    private double calories;
    //private Foodgroup foodgroup;

    public Food(int id, String name, double calories, int foodgroup){
        this.id = id;
        this. name = name;
        this.calories = calories;
        this.foodgroup = foodgroup;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCalories() {
        return calories;
    }

    public int getFoodgroup() {
        return foodgroup;
    }
}
