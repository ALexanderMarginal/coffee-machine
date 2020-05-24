public class Main {
    private static int counter;

    public static void main(String[] args) {
        for (Secret item :
                Secret.values()) {
            if (item.name().matches("^STAR.*")) {
                counter += 1;
            }
        }
        System.out.println(counter);
    }
}

/*
enum Secret {
    STAR, CRASH, START, // ...
}*/
