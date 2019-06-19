public class DemoThreadTerminated implements Runnable {

    private String name;

    public DemoThreadTerminated(String name) {
        this.name = name;
        System.out.println("Creating " + name);
    }

    public void run() {

    }
}
