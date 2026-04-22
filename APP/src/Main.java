public class Main {
    public static void main(String[] args) {

        var yard = new QuantityMeasurementApp.Quantity(1.0,
                QuantityMeasurementApp.LengthUnit.YARD);

        var feet = new QuantityMeasurementApp.Quantity(3.0,
                QuantityMeasurementApp.LengthUnit.FEET);

        var inch = new QuantityMeasurementApp.Quantity(36.0,
                QuantityMeasurementApp.LengthUnit.INCH);

        var cm = new QuantityMeasurementApp.Quantity(1.0,
                QuantityMeasurementApp.LengthUnit.CM);

        var inchFromCm = new QuantityMeasurementApp.Quantity(0.393701,
                QuantityMeasurementApp.LengthUnit.INCH);

        System.out.println("Yard == Feet: " + yard.equals(feet));
        System.out.println("Yard == Inches: " + yard.equals(inch));
        System.out.println("CM == Inches: " + cm.equals(inchFromCm));
    }
}