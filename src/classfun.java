public class SumArray {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20};
        int total = 0;

        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        System.out.println("Sum: " + total);
    }
}
