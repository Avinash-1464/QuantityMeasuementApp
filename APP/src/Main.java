public class Main {
    public static void main(String[] args) {

        var f = new QuantityMeasurementApp.Quantity(1.0,
                QuantityMeasurementApp.LengthUnit.FEET);

        var inch = new QuantityMeasurementApp.Quantity(12.0,
                QuantityMeasurementApp.LengthUnit.INCH);

        var result = f.add(inch);

        System.out.println("Result: " + result);
    }
}