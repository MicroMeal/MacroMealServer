public enum Gender {
    MALE,
    FEMALE;

    @Override
    public String toString() {
        String toReturn;
        switch (name()){
            case "MALE":    return "male";

            case "FEMALE":  return "female";

            default:        return "Unknown MovementExpenditure";
        }
    }
}
