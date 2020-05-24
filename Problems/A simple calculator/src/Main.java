import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        long firstNumber = Long.parseLong(inputs[0]);
        String operator = inputs[1];
        long secondNumber = Long.parseLong(inputs[2]);

        switch (operator) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "/":
                System.out.println(secondNumber == 0 ? "Division by 0!" : firstNumber / secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            default:
                System.out.println("Unknown operator");
        }
    }
}