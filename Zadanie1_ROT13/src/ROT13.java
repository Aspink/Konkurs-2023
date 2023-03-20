public class ROT13 {
    public static void main(String[] args) {
        String string = "To zdanie jest zakodowane.";
        String encrypted = rot13(string);
        System.out.println(string);
        System.out.println(encrypted);
        System.out.println(rot13(encrypted));
    }

    public static String rot13(String text) {
        char[] chars = text.toCharArray();
        String result = "";
        for (char letter : chars) {
            if ((letter >= 'a' && letter <= 'm') || (letter >= 'A' && letter <= 'M')) {
                letter += 13;
            } else if ((letter >= 'n' && letter <= 'z') || (letter >= 'N' && letter <= 'Z')) {
                letter -= 13;
            }
            result = result.concat(Character.toString(letter));
        }
        return result;
    }
}