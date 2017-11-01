package Food;

import java.util.HashMap;
import java.util.Map;

public enum Foodgroup {
    DAIRY(100),
    SPICES(200),
    BABY(300),
    FATS(400),
    POULTRY(500),
    SOUP(600),
    SAUSAGE(700),
    CEREAL(800),
    FRUIT(900),
    PORK(1000),
    VEGETABLE(1100),
    NUT(1200),
    BEEF(1300),
    BEVERAGE(1400),
    FISH(1500),
    LEGUME(1600),
    LAMB(1700),
    BAKED(1800),
    SWEET(1900),
    PASTA(2000),
    FAST(2100),
    MEAL(2200),
    SNACK(2500),
    NATIVE(3500),
    RESTAURANT(3600);

    private final int value;
    private static Map map = new HashMap<>();

    Foodgroup(final int newValue) {
        value = newValue;
    }

    static {
        for (Foodgroup foodGroup : Foodgroup.values()) {
            map.put(foodGroup.value, foodGroup);
        }
    }

    public static Foodgroup valueOf(int foodGroup) {
        return (Foodgroup) map.get(foodGroup);
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        String toReturn;
        switch (name()){
            case "DAIRY":       return "dairy and egg products";

            case "SPICES":      return "spices and herbs";

            case "BABY":        return "baby foods";

            case "FATS":        return "fats and oils";

            case "POULTRY":     return "poultry products";

            case "SOUP":        return "soups, sauces, and gravies";

            case "SAUSAGE":     return "sausages and luncheon meats";

            case "CEREAL":      return "breakfast cereals";

            case "FRUIT":       return "fruits and fruit juices";

            case "PORK":        return "pork products";

            case "VEGETABLE":   return "vegetables and vegetable products";

            case "NUT":         return "nut and seed products";

            case "BEEF":        return "beef products";

            case "BEVERAGE":    return "beverages";

            case "FISH":        return "finfish and shellfish products";

            case "LEGUME":      return "legumes and legume products";

            case "LAMB":        return "lamb, veal, and game products";

            case "BAKED":       return "baked products";

            case "SWEET":       return "sweets";

            case "PASTA":       return "cereal, grains, and pasta";

            case "FAST":        return "fast foods";

            case "MEAL":        return "meals, entrees, and side dishes";

            case "SNACK":       return "snacks";

            case "NATIVE":      return "American Indian/Alaskan native foods";

            case "RESTAURANT":  return "restaurant foods";

            default:        return "Unknown food group";
        }
    }
}