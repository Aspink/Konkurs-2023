public class FizzBuzz {
    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++) {
            StringBuilder sb = new StringBuilder();
            if(i % 3 == 0) {
                sb.append("Fizz");
            }
            if(i % 5 == 0) {
                sb.append("Buzz");
            }
            if(sb.length() == 0) {
                sb.append(i);
            }
            System.out.println(sb);
        }
    }
}