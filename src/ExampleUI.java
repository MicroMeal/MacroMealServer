import MacroCalculators.Enums.Gender;
import MacroCalculators.Enums.GoalEnum;
import MacroCalculators.MovementExpenditure;
import MacroCalculators.TDEECalories;

public class ExampleUI {
    public static void main(String[] args) {
        //TODO - goal calories after the todo in TDEE calories has been fixed.

        System.out.println("Welcome to the Macro Meal's calorie calculator");
        // A function to collect data about the user

        TDEECalories tdeeCalories = new TDEECalories(69, 175, 20, Gender.FEMALE, MovementExpenditure.VERYACTIVE);

        GoalEnum goalChosen = GoalEnum.GAINVERYSLOW;

        goalChosen.getGoalCalories(tdeeCalories.getFinalTDEE());

        //Printing
        System.out.println("Here are the values you provided: \n");
        System.out.println("Weight in KG: " + tdeeCalories.getWeightInKG());
        System.out.println("Age: " + tdeeCalories.getAge());
        System.out.println("Height in CM: " + tdeeCalories.getHeightInCM());
        System.out.println("MacroCalculators.Enums.Gender: " + tdeeCalories.getGender());
        System.out.println("Movement Expenditure Chosen: " + tdeeCalories.getMovementExpenditure() + "\n");

        System.out.println("Movement Expenditure Chosen: " + tdeeCalories.getFinalTDEE() + "\n");

        //System.out.println("You have chosen the goal: " + goalChosen.toString());
        //System.out.println("Your goal calories are: " + goalChosen.getGoalCalories(tdeeCalories.getFinalTDEE()));
    }
}
