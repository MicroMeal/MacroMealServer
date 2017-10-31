package Food;

public class Food {
    private int id;
    private String name;
    private double calories;
    private Foodgroup foodgroup;

    public Food food(int id, String name, double calories, Foodgroup fooogroup){
        this.id = id;
        this. name = name;
        this.calories = calories;
        this.foodgroup = fooogroup;

        return null; //Don't forget to set this to what you want. null for now due to compiation errors
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

    public Foodgroup getFoodgroup() {
        return foodgroup;
    }
}
