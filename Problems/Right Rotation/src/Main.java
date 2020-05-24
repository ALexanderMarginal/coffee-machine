import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int end = sc.nextInt();
        if (end > numbers.length) {
            end = end % numbers.length;
        }

        for (int i = numbers.length - end; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        for (int i = 0; i < numbers.length - end; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}