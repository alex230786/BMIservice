public class BMIservice {
    public int calculate(int kg, double m) {
        int BMI;
        BMI = (int) (kg / (m * m));
        return BMI;
    }
}

