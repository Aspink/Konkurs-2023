public class ROT13 {
    public static void main(String[] args) {
        String string = "To zdanie jest zakodowane.";
        String encrypted = rot13(string);
        System.out.println(encrypted);
    }
}