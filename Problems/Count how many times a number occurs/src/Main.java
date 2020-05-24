import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] numbers = new int[len];
        for (int i = 0; i < len; i++) {
            numbers[i] = sc.nextInt();
        }
        int searchNumber = sc.nextInt();
        int count = 0;
        for (int item :
                numbers) {
            if (item == searchNumber) {
                count++;
            }
        }
        System.out.println(count);
    }
}
