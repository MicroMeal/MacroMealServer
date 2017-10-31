package MacroCalculators;

import MacroCalculators.Enums.Gender;

/**
 * https://healthyeater.com/how-to-calculate-your-macros
 */
public class GoalCalories extends TDEECalories {

    //Weight gain / loss percentages
    double tenPercent = 0.1, twentyPercent = 0.2, thirtyPercent = 0.3, fourtyPercent = 0.4;

    public GoalCalories(double weightInKG, double heightInCM, int age, Gender gender, MovementExpenditure movExp){
        setWeightInKG(weightInKG);
        setHeightInCM(heightInCM);
        setAge(age);
        setGender(gender);
        setMovementExpenditure(movExp);
    }


}
