package MacroCalculators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Faze on 25/11/2017.
 */
public class MacrosInGrams {

    public HashMap<String, Integer> MacrosInGrams (int calories){

        HashMap<String, Integer> macroMap = new HashMap<>();

        //This will contain the grams of protein a user needs to consume
        macroMap.put("Protein", ((Double) (calories * 0.30 / 4)).intValue());

        //This will contain the grams of Carbohydrates a user needs to consume
        macroMap.put("Carbohydrates", ((Double) (calories * 0.55 / 4)).intValue());

        //This will contain the grams of fats a user needs to consume
        macroMap.put("Fats", ((Double) (calories * 0.15 / 9)).intValue());


        return macroMap;

    }

}
