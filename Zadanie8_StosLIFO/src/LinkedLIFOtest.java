import java.util.Deque;
import java.util.LinkedList;

public class LinkedLIFOtest {
    public static void main(String[] args) {
        LinkedLIFO<String> Cities = new LinkedLIFO<>();
        Deque<String> CitiesJ = new LinkedList<>();
        System.out.println("Czy mój stos jest pusty? " + Cities.isEmpty() + "\tCzy stos Javy jest pusty? " + CitiesJ.isEmpty());
        Cities.push("Warsaw");
        Cities.push("New York");
        Cities.push("London");
        Cities.push("Pekin");
        Cities.push("Sydney");
        CitiesJ.push("Warsaw");
        CitiesJ.push("New York");
        CitiesJ.push("London");
        CitiesJ.push("Pekin");
        CitiesJ.push("Sydney");
        System.out.println("Dodaliśmy 5 miast.");
        System.out.println("Ile miast jest w moim stosie? " + Cities.size() + "\tIle miast jest w stosie Javy? " + CitiesJ.size());
        System.out.println("Czy mój stos jest pusty? " + Cities.isEmpty() + "\tCzy stos Javy jest pusty? " + CitiesJ.isEmpty());

    }
}