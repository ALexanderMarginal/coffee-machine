import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] numbers = new int[len];
        for (int i = 0; i < len; i++) {
            numbers[i] = sc.nextInt();
        }
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        for (int i = 0; i < len - 1; i++) {
            if (numbers[i] == number1 && numbers[i + 1] == number2 ||
                    numbers[i] == number2 && numbers[i + 1] == number1) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}
