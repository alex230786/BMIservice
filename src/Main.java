// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BMIservice service = new BMIservice();
        int BMI = service.calculate(87, 1.83);
        System.out.println("индекс массы тела: " + BMI);
    }
}