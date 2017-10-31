public class ExampleUI {
    public static void main(String[] args) {
        System.out.println("Welcome to the TDEECalories calculator");
        // Example TDEECalories
        GoalCalories sampleGoalCalories = new GoalCalories(88, 180, 23, Gender.MALE, MovementExpenditure.VERYACTIVE);

        /*
        //Printing
        System.out.println("Here are the values you provided: \n");
        System.out.println("Weight in KG: " + sampleGoalCalories.getWeightInKG());
        System.out.println("Age: " + sampleGoalCalories.getAge());
        System.out.println("Height in CM: " + sampleGoalCalories.getHeightInCM());
        System.out.println("Gender: " + sampleGoalCalories.getGender());
        System.out.println("Movement Expenditure Chosen: " + sampleGoalCalories.getMovementExpenditure() + "\n");
        System.out.println("Your TDEECalories is: " + sampleGoalCalories.getFinalTDEE());
        */

        DBQueryHandler dbq = new DBQueryHandler("jdbc:mysql://localhost/fitmeal?useSSL=false", "remoteUser", "D!cksl1nger");
        dbq.getFood(21350);
    }
}
