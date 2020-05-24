import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().split(" ");
        for (int i = 0; i < strs.length - 1; i++) {
            String[] str = strs[i].split("");
            for (int j = 0; j < str.length - 1; j++) {
                if (str[j].compareTo(str[j + 1]) != -1) {
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
    }
}
