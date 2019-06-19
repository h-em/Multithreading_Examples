public class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Runnable is running: "+ name);
    }
}
