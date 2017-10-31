import MacroCalculators.Enums.Gender;
import MacroCalculators.GoalCalories;
import MacroCalculators.MovementExpenditure;

public class ExampleUI {
    public static void main(String[] args) {
        System.out.println("Welcome to the MacroCalculators.TDEECalories calculator");
        // Example MacroCalculators.TDEECalories
        GoalCalories sampleGoalCalories = new GoalCalories(88, 180, 23, Gender.MALE, MovementExpenditure.VERYACTIVE);

        //Printing
        System.out.println("Here are the values you provided: \n");
        System.out.println("Weight in KG: " + sampleGoalCalories.getWeightInKG());
        System.out.println("Age: " + sampleGoalCalories.getAge());
        System.out.println("Height in CM: " + sampleGoalCalories.getHeightInCM());
        System.out.println("MacroCalculators.Enums.Gender: " + sampleGoalCalories.getGender());
        System.out.println("Movement Expenditure Chosen: " + sampleGoalCalories.getMovementExpenditure() + "\n");
        System.out.println("Your MacroCalculators.TDEECalories is: " + sampleGoalCalories.getFinalTDEE());
    }
}
