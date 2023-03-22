import java.util.Scanner;
public class TemperatureUnitConverter {
    public static void main(String[] args) {
        String again = "T";
        Scanner scanner = new Scanner(System.in);
        while(again.equals("T")) {
            String unit = "";
            while (!unit.equals("C") && !unit.equals("K") && !unit.equals("F")) {
                System.out.print("W jakich jednostkach chcesz podać temperaturę? Wybierz C (celsius), K (Kelvin) lub F (Fahrenheit): ");
                unit = scanner.nextLine().toUpperCase();
            }

            System.out.print("Czy chcesz dokonać kolejnego przeliczenia? T (tak), dowolny inny (nie): ");
            again = scanner.nextLine().toUpperCase();
        }
    }
    public static double convertCtoK(double celsius) {
        return celsius + 273.15;
    }
    public static double convertCtoF(double celsius) {
        return (celsius * 1.8) + 32;
    }
    public static double convertKtoC(double kelvin) {
        return kelvin - 273.15;
    }
    public static double convertKtoF(double kelvin) {
        return convertCtoF(convertKtoC(kelvin));
    }
    public static double convertFtoC(double fahrenheit) {
        return (fahrenheit - 32.0) / 1.8;
    }
    public static double convertFtoK(double fahrenheit) {
        return convertCtoK(convertFtoC(fahrenheit));
    }
}