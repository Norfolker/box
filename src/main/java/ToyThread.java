public class ToyThread extends Thread {

    protected int count = 0;
    protected int iteration = 5;
    @Override
    public void run() {
        while (count < iteration) {
            if (BoxMain.tumbler.equals("включен")) {
            BoxMain.tumbler = "выключен";
            System.out.println("Тумблер выключен");
            count++;
            }
        }
        interrupt();
    }
}
