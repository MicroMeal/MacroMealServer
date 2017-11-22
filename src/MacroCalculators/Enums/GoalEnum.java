package MacroCalculators.Enums;

/**
 * Created by Faze on 08/11/2017.
 */
public enum GoalEnum  {

    GAINVERYSLOW, GAINSLOW, GAINFAST, GAINVERYFAST, //For gaining weight
    LOSEVERYSLOW, LOSESLOW, LOSEFAST, LOSEVERYFAST; //For losing weight

    @Override
    public String toString() {
        String toReturn;
        switch (name()){
            case "GAINVERYSLOW": toReturn = "Gain very slow";

            case "GAINSLOW":  toReturn = "Gain slow";

            case "GAINFAST":  toReturn = "Gain fast";

            case "GAINVERYFAST": toReturn = "Gain very fast";

            case "LOSEVERYSLOW": toReturn = "Lose very slow";

            case "LOSESLOW": toReturn = "Lose slow";

            case "LOSEFAST": toReturn = "Lose fast";

            case "LOSEVERYFAST": toReturn = "Lose very fast";

            default: toReturn = "You have not selected a goal, maintenance calories are presented."; //Else maintenance calories

                return toReturn;
        }
    }

    public int getGoalCalories(int userCalories) {
        switch (name()){
            case "GAINVERYSLOW":    return fromDecimalToInt(1.11 * userCalories);

            case "GAINSLOW":  return fromDecimalToInt(1.12 * userCalories);

            case "GAINFAST":  return fromDecimalToInt(1.13 * userCalories);

            case "GAINVERYFAST":  return fromDecimalToInt(1.14 * userCalories );

            case "LOSEVERYSLOW":  return fromDecimalToInt(0.9 * userCalories);

            case "LOSESLOW":  return fromDecimalToInt(0.8 * userCalories);

            case "LOSEFAST":  return fromDecimalToInt(0.7 * userCalories);

            case "LOSEVERYFAST":  return fromDecimalToInt(0.6 * userCalories);

            default:        return fromDecimalToInt(userCalories); //Else maintenance calories
        }
    }

    public int fromDecimalToInt (double toBeInt){
        return (int)toBeInt;
    }

}
