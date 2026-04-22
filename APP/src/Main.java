public class Main {
    public static void main(String[] args) {

        System.out.println("1 ft -> inches: " +
                QuantityMeasurementApp.convert(1.0,
                        QuantityMeasurementApp.LengthUnit.FEET,
                        QuantityMeasurementApp.LengthUnit.INCH));

        System.out.println("3 yards -> feet: " +
                QuantityMeasurementApp.convert(3.0,
                        QuantityMeasurementApp.LengthUnit.YARD,
                        QuantityMeasurementApp.LengthUnit.FEET));

        System.out.println("2.54 cm -> inches: " +
                QuantityMeasurementApp.convert(2.54,
                        QuantityMeasurementApp.LengthUnit.CM,
                        QuantityMeasurementApp.LengthUnit.INCH));
    }
}