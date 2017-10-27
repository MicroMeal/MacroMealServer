/**
 * Designed for FitMeal by Matthew Edwards, Andras Herczeg and Faisal Rahman
 *
 * This class returns an int value which will be the TDEE calories.
 *
 * TDEE, total daily energy expenditure, is the amount of energy in calories you burn per day.
 * TDEE is best calculated by factoring in your BMR, or basal metabolic rate, and your activity level.
 *
 * The following page is used as a general guide: https://healthyeater.com/how-to-calculate-your-macros
 */

public class TDEE {

    //Static values for testing
    private double weightInKG = 88;
    private int age = 29;
    private double heightInCM = 183;
    private Gender gender = Gender.MALE;
    private MovementExpenditure movementExpenditure = MovementExpenditure.VERYACTIVE;
    private int restingEnergyExpenditure;
    private int finalTDEE;

    public static void main(String[] args) {
        System.out.println("Welcome to the TDEE calculator");
        TDEE t = new TDEE();
        t.getTDEE();

        //Printing
        System.out.println("Here are the values you provided: \n");
        System.out.println("Weight in KG: " + t.weightInKG);
        System.out.println("Age: " + t.age);
        System.out.println("Height in CM: " + t.heightInCM);
        System.out.println("Gender: " + t.gender);
        System.out.println("Movement Expenditure Chosen: " + t.movementExpenditure + "\n");
        System.out.println("Your TDEE is: " + t.finalTDEE);
    }

    private void getTDEE(){
        /**
         * Males and females have different TDEE...
         */
        if (gender.equals(Gender.MALE)){
            maleForumla();
        }
        else {
            femaleForumla();
        }
    }

    private void maleForumla(){

        /**
         * The forumla used in this method is The Mifflin, M. D., St Jeor formula.
         * For males: 10 x weight (kg) + 6.25 x height (cm) – 5 x age (y) + 5 = REE
         */
        restingEnergyExpenditure = ((Double) (10 * weightInKG + 6.25 * heightInCM - 5 * age + 5)).intValue();
        getMovementExpenditure();
    }

    private void femaleForumla(){

        /**
         * The forumla used in this method is The Mifflin, M. D., St Jeor formula.
         * For females: 10 x weight (kg) + 6.25 x height (cm) – 5 x age (y) – 161 = REE
         */
        restingEnergyExpenditure = ((Double) (10 * weightInKG + 6.25 * heightInCM - 5 * age - 161)).intValue();
        getMovementExpenditure();
    }

    private void getMovementExpenditure(){
        switch(movementExpenditure){
            case SEDENTARY:
                //Just normal everyday activity like a little walking, a couple
                // flights of stairs, eating, talking etc. (REE X 1.2)
                finalTDEE = ((Double) (restingEnergyExpenditure * 1.2)).intValue();

            case LIGHTACTIVITY:
                //Any activity that burns an additional 200-400 calories for females
                // or 250-500 calories for males more than your sedentary amount. (REE x 1.375)
                finalTDEE = ((Double) (restingEnergyExpenditure * 1.375)).intValue();

            case MODERATEACTIVITY:
                //Any activity that burns an additional 400-650 calories for females
                // or 500-800 calories for males more than your sedentary amount. (REE x 1.55)
                finalTDEE = ((Double) (restingEnergyExpenditure * 1.55)).intValue();

            case VERYACTIVE:
                //Any activity that burns more than about 650 calories for females
                // or more than 800 calories for males in addition to your sedentary amount. (REE x 1.725)
                finalTDEE = ((Double) (restingEnergyExpenditure * 1.725)).intValue();
        }
    }

}
