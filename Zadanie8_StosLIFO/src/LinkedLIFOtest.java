import java.util.Deque;
import java.util.LinkedList;

public class LinkedLIFOtest {
    public static void main(String[] args) {
        LinkedLIFO<String> Cities = new LinkedLIFO<>();
        Deque<String> CitiesJ = new LinkedList<>();
        System.out.println("Czy mój stos jest pusty? " + Cities.isEmpty() + "\t\tCzy stos Javy jest pusty? " + CitiesJ.isEmpty());
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
        System.out.println("Ile miast jest w moim stosie? " + Cities.size() + "\t\tIle miast jest w stosie Javy? " + CitiesJ.size());
        System.out.println("Czy mój stos jest pusty? " + Cities.isEmpty() + "\t\tCzy stos Javy jest pusty? " + CitiesJ.isEmpty());
        System.out.println("Zabieramy ostatnie miasto. Jakie to miasto?");
        System.out.println("Mój stos: " + Cities.pop() + "\t\tStos Javy: " + CitiesJ.pop());
        System.out.println("Jakie miasto jest teraz na szczycie stosu?");
        System.out.println("Mój stos: " + Cities.peek() + "\t\tStos Javy: " + CitiesJ.peek());
        System.out.println("Ile miast jest w moim stosie? " + Cities.size() + "\t\tIle miast jest w stosie Javy? " + CitiesJ.size());

    }
}