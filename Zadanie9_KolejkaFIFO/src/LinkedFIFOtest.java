import java.util.ArrayDeque;
import java.util.Queue;

public class LinkedFIFOtest {
    public static void main(String[] args) {
        LinkedFIFO<String> Cities = new LinkedFIFO<>();
        TabFIFO<String> CitiesTab = new TabFIFO<>();
        Queue<String> CitiesJ = new ArrayDeque<>();
        System.out.println("Czy moja kolejka jest pusta? " + Cities.isEmpty() + "\t\tCzy moja tablica jest pusta? " + CitiesTab.isEmpty() + "\t\tCzy kolejka Javy jest pusta? " + CitiesJ.isEmpty());
        Cities.add("Warsaw");
        Cities.add("New York");
        Cities.add("London");
        Cities.add("Peking");
        Cities.add("Sydney");
        CitiesTab.add("Warsaw");
        CitiesTab.add("New York");
        CitiesTab.add("London");
        CitiesTab.add("Peking");
        CitiesTab.add("Sydney");
        CitiesJ.add("Warsaw");
        CitiesJ.add("New York");
        CitiesJ.add("London");
        CitiesJ.add("Peking");
        CitiesJ.add("Sydney");
        System.out.println("Dodaliśmy 5 miast: Warsaw, New York, London, Peking i Sydney.");
        System.out.println("Ile miast jest w mojej kolejce? " + Cities.size() + "\t\tIle miast jest w mojej tablicy? " + CitiesTab.size() + "\t\tIle miast jest w kolejce Javy? " + CitiesJ.size());
        System.out.println("Czy moja kolejka jest pusta? " + Cities.isEmpty() + "\t\tCzy moja tablica jest pusta? " + CitiesTab.isEmpty() + "\t\tCzy kolejka Javy jest pusta? " + CitiesJ.isEmpty());
        System.out.println("Zabieramy pierwsze miasto. Jakie to miasto?");
        System.out.println("Moja kolejka: " + Cities.poll() + "\t\t\t\t\tMoja tablica: " + CitiesTab.poll() + "\t\t\t\t\tKolejka Javy: " + CitiesJ.poll());
        System.out.println("Jakie miasto jest teraz na początku kolejki?");
        System.out.println("Moja kolejka: " + Cities.peek() + "\t\t\t\t\tMoja tablica: " + CitiesTab.peek() + "\t\t\t\t\tKolejka Javy: " + CitiesJ.peek());
        System.out.println("Ile miast jest w mojej kolejce? " + Cities.size() + "\t\tIle miast jest w mojej tablicy? " + CitiesTab.size() + "\t\tIle miast jest w kolejce Javy? " + CitiesJ.size());
        System.out.println("Zabieramy kolejne miasto. Jakie to miasto?");
        System.out.println("Moja kolejka: " + Cities.poll() + "\t\t\t\t\tMoja tablica: " + CitiesTab.poll() + "\t\t\t\t\tKolejka Javy: " + CitiesJ.poll());
        System.out.println("Jakie miasto jest teraz na początku kolejki?");
        System.out.println("Moja kolejka: " + Cities.peek() + "\t\t\t\t\tMoja tablica: " + CitiesTab.peek() + "\t\t\t\t\tKolejka Javy: " + CitiesJ.peek());
        System.out.println("Ile miast jest w mojej kolejce? " + Cities.size() + "\t\tIle miast jest w mojej tablicy? " + CitiesTab.size()  + "\t\tIle miast jest w kolejce Javy? " + CitiesJ.size());
        System.out.println("Czy moja kolejka jest pusta? " + Cities.isEmpty() + "\t\tCzy moja tablica jest pusta? " + CitiesTab.isEmpty() + "\t\ttCzy kolejka Javy jest pusta? " + CitiesJ.isEmpty());
    }
}