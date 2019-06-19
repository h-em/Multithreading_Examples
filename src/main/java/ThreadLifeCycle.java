public class ThreadLifeCycle{

    public void stateNew(){
        Runnable runnable = new DemoRunnable("Thread_1");
        Thread thread = new Thread(runnable);
        System.out.println("State: " + thread.getState());
    }

    public void stateRunnable(){
        Runnable runnable = new DemoRunnable("Thread_2");
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("State: " + thread.getState());
    }

    public void stateTimeWaiting(){
        Thread thread = new Thread(new DemoThreadWaiting("Thread_3"));
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("State: " + thread.getState());

    }

    public void stateTerminated(){
        Thread thread = new Thread(new DemoThreadTerminated("Thread_4"));
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("State: " + thread.getState());

    }

    public void stateBlocked(){
        Thread thread1 = new Thread(new DemoThreadBlocked("Thread_5"));
        Thread thread2 = new Thread(new DemoThreadBlocked("Thread_6"));

        thread1.start();
        thread2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Name: " +thread2.getName() +"\nThread state: "
                + thread2.getState());
    }

}
