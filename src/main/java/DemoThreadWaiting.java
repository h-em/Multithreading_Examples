public class DemoThreadWaiting implements Runnable {
    private String name;

    public DemoThreadWaiting(String name) {
        this.name = name;
        System.out.println("Creating " + name);
    }

    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("State: " + Thread.currentThread().getState());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
