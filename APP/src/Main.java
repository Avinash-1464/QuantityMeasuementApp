public class Main {
    public static void main(String[] args) {

        var f = new QuantityMeasurementApp.Quantity(1.0, LengthUnit.FEET);
        var inch = new QuantityMeasurementApp.Quantity(12.0, LengthUnit.INCH);

        System.out.println(
                QuantityMeasurementApp.Quantity.add(f, inch, LengthUnit.FEET));

        System.out.println(
                QuantityMeasurementApp.Quantity.add(f, inch, LengthUnit.INCH));

        System.out.println(
                QuantityMeasurementApp.Quantity.add(f, inch, LengthUnit.YARD));
    }
}