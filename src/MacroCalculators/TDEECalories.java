package MacroCalculators;

import MacroCalculators.Enums.Gender;
import javafx.scene.paint.Stop;

//TODO - movement expenditure returning wrong results when added with REE

/**
 *
 * MacroCalculators.TDEECalories, total daily energy expenditure, is the amount of energy in calories you burn per day.
 * MacroCalculators.TDEECalories is best calculated by factoring in your BMR, or basal metabolic rate, and your activity level.
 *
 * The following page is used as a general guide: https://healthyeater.com/how-to-calculate-your-macros
 */

public class TDEECalories {

    //Static values for testing

    private double weightInKG, heightInCM;
    public int age, restingEnergyExpenditure, finalTDEE;
    private Gender gender;
    private MovementExpenditure movementExpenditure;


    public TDEECalories(double weightInKG, double heightInCM, int age, MacroCalculators.Enums.Gender gender, MacroCalculators.MovementExpenditure movExp){
        this.weightInKG = weightInKG;
        this.heightInCM = heightInCM;
        this.age = age;
        this.gender = gender;
        this.movementExpenditure = movExp;
        this.getTDEE();
    }




    public TDEECalories(){
        super();
    }

    private void getTDEE(){
        /**
         * Males and females have different MacroCalculators.TDEECalories...
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
         * Harris J, Benedict F. A biometric study of basal metabolism in man. Washington D.C. Carnegie Institute of Washington. 1919.
         */

        restingEnergyExpenditure = ((Double) (66.5 + (13.75 * weightInKG) + (5.003 * heightInCM) - (6.775 * age))).intValue();
        calculateMovementExpenditure();
    }

    private void femaleForumla(){

        /**
         * Harris J, Benedict F. A biometric study of basal metabolism in man. Washington D.C. Carnegie Institute of Washington. 1919.
         */

        restingEnergyExpenditure = ((Double) (655.1 + (9.563 * weightInKG) + (1.850 * heightInCM) - (4.676 * age))).intValue();
        calculateMovementExpenditure();
    }

    private void calculateMovementExpenditure(){
        switch(movementExpenditure){
            case SEDENTARY:
                //Just normal everyday activity like a little walking, a couple
                // flights of stairs, eating, talking etc. (REE X 1.2)
                finalTDEE = ((Double) (restingEnergyExpenditure * 1.2)).intValue();
                break;

            case LIGHTACTIVITY:
                //Any activity that burns an additional 200-400 calories for females
                // or 250-500 calories for males more than your sedentary amount. (REE x 1.375)
                finalTDEE = ((Double) (restingEnergyExpenditure * 1.375)).intValue();
                break;

            case MODERATEACTIVITY:
                //Any activity that burns an additional 400-650 calories for females
                // or 500-800 calories for males more than your sedentary amount. (REE x 1.55)
                finalTDEE = ((Double) (restingEnergyExpenditure * 1.55)).intValue();
                break;

            case VERYACTIVE:
                //Any activity that burns more than about 650 calories for females
                // or more than 800 calories for males in addition to your sedentary amount. (REE x 1.725)
                finalTDEE = ((Double) (restingEnergyExpenditure * 1.725)).intValue();
                break;
        }
    }


    public double getHeightInCM() {
        return heightInCM;
    }

    public double getWeightInKG() {
        return weightInKG;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getRestingEnergyExpenditure() {
        return restingEnergyExpenditure;
    }

    public MovementExpenditure getMovementExpenditure(){
        return  this.movementExpenditure;
    }

    public int getFinalTDEE() {return this.finalTDEE;}

    public void setWeightInKG(double weightInKG){
        this.weightInKG = weightInKG;
    }

    public void setHeightInCM(double heightInCM) {
        this.heightInCM = heightInCM;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setMovementExpenditure(MovementExpenditure movementExpenditure) {
        this.movementExpenditure = movementExpenditure;
    }

}
