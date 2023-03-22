public class TemperatureUnitConverter {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static double convertCtoK(double celsius) {
        return celsius + 273.15;
    }
    public static double convertCtoF(double celsius) {
        return (celsius * 1.8) + 32;
    }
}