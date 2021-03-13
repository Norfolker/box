public class UserThread extends Thread {

    protected int count = 0;
    protected int iteration = 5;
    protected int time = 1500;

    @Override
    public void run() {
        while (count < iteration) {
            BoxMain.tumbler = "включен";
            System.out.println("Тумблер включен");
            count++;
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        interrupt();
    }
}
