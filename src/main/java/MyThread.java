public class MyThread extends Thread {

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Thread is running: "+ name);

    }
}
