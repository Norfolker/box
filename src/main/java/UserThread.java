public class UserThread extends Thread {

    protected static int count = 0;

    @Override
    public void run() {
        while (count < BoxMain.iteration) {
            BoxMain.tumbler = "включен";
            System.out.println("Тумблер включен");
            count++;
            try {
                Thread.sleep(BoxMain.time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        interrupt();
    }
}
