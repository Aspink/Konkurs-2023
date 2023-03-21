public class CaesarsCode {
    public static void main(String[] args) {
        String string = "To zdanie jest zakodowane.";
        int shift1 = 13;
        int shift2 = 6;
        int shift3 = 7;
        System.out.println("Tekst początkowy: " + string);
        String string1 = ceasarsCode(shift1, string);
        System.out.println("Tekst początkowy po zaszyfrowaniu (przesunięcie: " + shift1 + ") :" + string1);
        String string2 = ceasarsCode(shift2, string1);
        System.out.println("Tekst powyżej po zaszyfrowaniu    (przesunięcie:  " + shift2 + ") :" + string2);
        String string3 = ceasarsCode(shift3, string2);
        System.out.println("Tekst powyżej po zaszyfrowaniu    (przesunięcie:  " + shift3 + ") :" + string3);
    }
    public static String ceasarsCode(int shift, String text) {
        StringBuilder codedText = new StringBuilder();
        char[] chars = text.toLowerCase().toCharArray();
        for (char letter : chars) {
            if(Character.isLetter(letter)) {
                letter = (char) (((letter + shift - 'a') % 26) + 'a');
            }
            codedText.append(letter);
        }
        return codedText.toString();
    }
}