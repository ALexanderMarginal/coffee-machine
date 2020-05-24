import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int directionNumber = sc.nextInt();
        if (directionNumber == 0) {
            System.out.println("do not move");
            return;
        }
        Map<Integer, String> hashMap = new HashMap<Integer, String>() {{
            put(1, "up");
            put(2, "down");
            put(3, "left");
            put(4, "right");
        }};
        String direction = hashMap.get(directionNumber);
        if (direction == null) {
            System.out.println("error!");
            return;
        }
        System.out.printf("move %s\n", direction);
    }
}