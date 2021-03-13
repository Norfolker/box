public class BoxMain {

    volatile static String tumbler = "выключен";

    public static void main(String[] args) {

        new UserThread().start();
        new ToyThread().start();
    }
}
