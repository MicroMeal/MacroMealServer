public class ExampleUI {
    public static void main(String[] args) {
        System.out.println("Welcome to the TDEE calculator");
        // Example TDEE
        TDEE sampleTDEE = new TDEE(88, 180, 23, Gender.MALE, MovementExpenditure.VERYACTIVE);

        //Printing
        System.out.println("Here are the values you provided: \n");
        System.out.println("Weight in KG: " + sampleTDEE.getWeightInKG());
        System.out.println("Age: " + sampleTDEE.getAge());
        System.out.println("Height in CM: " + sampleTDEE.getHeightInCM());
        System.out.println("Gender: " + sampleTDEE.getGender());
        System.out.println("Movement Expenditure Chosen: " + sampleTDEE.getMovementExpenditure() + "\n");
        System.out.println("Your TDEE is: " + sampleTDEE.getFinalTDEE());
    }
}
