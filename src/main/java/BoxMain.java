public class BoxMain {

    volatile static String tumbler = "выключен";
    protected static int iteration = 5;
    protected static int time = 1500;

    public static void main(String[] args) {

        new UserThread().start();
        new ToyThread().start();
    }
}
