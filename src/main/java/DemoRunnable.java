public class DemoRunnable implements Runnable{

    private String threadName;
    private Thread thread;

    public DemoRunnable(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating "+ threadName);
    }

    public void run() {
        System.out.println("Running: "+ threadName);
        for (int i = 0; i <4 ; i++) {
            System.out.println("Thread name: "+ threadName + " "+ i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Exiting: " + threadName);
    }

    public void start(){
        System.out.println("Starting "+ threadName);
         if(thread == null){
             thread = new Thread(this, threadName);
             thread.start();
         }
    }
}
