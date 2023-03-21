public class CaesarsCode {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
    public static String ceasarsCode(int shift, String text) {
        StringBuilder codedText = new StringBuilder();
        char[] chars = text.toCharArray();
        for (char letter : chars) {
            if(Character.isLetter(letter)) {
                letter = (char) (((letter + shift - 'a') % 26) + 'a');
            }
            codedText.append(letter);
        }
        return codedText.toString();
    }
}