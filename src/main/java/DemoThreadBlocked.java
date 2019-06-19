public class DemoThreadBlocked implements Runnable {
    private String name;

    public DemoThreadBlocked(String name) {
        this.name = name;
        System.out.println("Creating "+ name);
    }

    public void run() {
        commonResource();
    }

    public static synchronized void commonResource(){
        while(true){}
    }

    public String getName() {
        return name;
    }
}
