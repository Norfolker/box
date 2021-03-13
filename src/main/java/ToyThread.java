public class ToyThread extends Thread {

    @Override
    public void run() {
        while (UserThread.count < BoxMain.iteration) {
            if (BoxMain.tumbler.equals("включен")) {
            BoxMain.tumbler = "выключен";
            System.out.println("Тумблер выключен");
            }
        }
        interrupt();
    }
}
