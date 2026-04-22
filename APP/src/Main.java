public class Main {
    public static void main(String[] args) {

        QuantityMeasurementApp.Feet f1 = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet f2 = new QuantityMeasurementApp.Feet(1.0);

        boolean result = f1.equals(f2);

        System.out.println("Are equal? " + result);
    }
}
