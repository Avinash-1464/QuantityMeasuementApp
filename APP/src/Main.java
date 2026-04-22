public class Main {
    public static void main(String[] args) {

        boolean feetResult = QuantityMeasurementApp.compareFeet(1.0, 1.0);
        boolean inchResult = QuantityMeasurementApp.compareInches(1.0, 1.0);

        System.out.println("Feet equal? " + feetResult);
        System.out.println("Inches equal? " + inchResult);
    }
}