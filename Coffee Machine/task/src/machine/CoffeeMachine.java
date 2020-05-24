package machine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeMachine {
    private static int haveMoney = 550;
    private static int haveWater = 400;
    private static int haveMilk = 540;
    private static int haveCoffee = 120;
    private static int haveCups = 9;
    private static final Map<Integer, Coffee> coffeeMap = new HashMap<Integer, Coffee>() {{
        put(1, new Coffee("espresso", 250, 0, 16, 4));
        put(2, new Coffee("latte", 350, 75, 20, 7));
        put(3, new Coffee("cappuccino", 200, 100, 12, 6));
    }};

    public static void main(String[] args) {
        chooseAction();
    }

    private static void showStatistic() {
        System.out.printf(
                "\nThe coffee machine has:\n%s of water\n%s of milk\n%s of coffee beans\n%s of disposable cups\n%s of money\n\n",
                haveWater,
                haveMilk,
                haveCoffee,
                haveCups,
                haveMoney
        );
        chooseAction();
    }

    private static void chooseAction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String action = sc.nextLine();
        switch (action) {
            case "take":
                take();
                break;
            case "fill":
                fill();
                break;
            case "remaining":
                showStatistic();
                break;
            case "exit":
                System.exit(0);
            default:
                buy();
        }
    }

    private static void buy() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        Coffee coffee = coffeeMap.get(sc.nextInt());
        if (coffee == null) {
            buy();
            return;
        }

        if (haveWater - coffee.getWater() >= 0 &&
                haveMilk - coffee.getMilk() >= 0 &&
                haveCoffee - coffee.getCoffee() >= 0 &&
                haveCups > 0) {
            System.out.println("I have enough resources, making you a coffee!\n");
            haveWater -= coffee.getWater();
            haveMilk -= coffee.getMilk();
            haveCoffee -= coffee.getCoffee();
            haveCups -= 1;
            haveMoney += coffee.getPrice();
        } else {
            System.out.println("Sorry, not enough water!\n");
        }
        chooseAction();
    }

    private static void take() {
        System.out.println("\nI gave you $" + haveMoney + "\n");
        haveMoney = 0;
        chooseAction();
    }

    private static void fill() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Write how many ml of water do you want to add:");
        haveWater += sc.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        haveMilk += sc.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        haveCoffee += sc.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        haveCups += sc.nextInt();
        System.out.println();
        chooseAction();
    }

    private static class Coffee {
        private final String name;
        private final int water;
        private final int milk;
        private final int coffee;
        private final int price;

        public Coffee(String name, int water, int milk, int coffee, int price) {
            this.coffee = coffee;
            this.milk = milk;
            this.name = name;
            this.price = price;
            this.water = water;
        }

        public int getWater() {
            return this.water;
        }

        public int getMilk() {
            return this.milk;
        }

        public int getCoffee() {
            return this.coffee;
        }

        public int getPrice() {
            return this.price;
        }
    }
}
