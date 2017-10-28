public enum MovementExpenditure {
    SEDENTARY,
    LIGHTACTIVITY,
    MODERATEACTIVITY,
    VERYACTIVE;

    @Override
    public String toString() {
        String toReturn;
        switch (name()){
            case "SEDENTARY":           return "sedentary";

            case "LIGHTACTIVITY":       return "light activity";

            case "MODERATEACTIVITY":    return "moderate activity";

            case "VERYACTIVE":          return "very active";

            default:                    return "unknown MovementExpenditure";
        }
    }
}
