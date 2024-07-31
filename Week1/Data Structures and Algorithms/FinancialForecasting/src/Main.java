public class Main {

    public static double calculateFutureValue(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        return calculateFutureValue(initialValue * (1 + growthRate), growthRate, years - 1);

    }

    public static void main(String[] args) {
        double initialValue = 2000.0;
        double growthRate = 0.05;
        int years = 7;

        double futureValue = calculateFutureValue(initialValue, growthRate, years);
        System.out.println("Future value after " + years + " years: Rs." + futureValue);
    }
}
