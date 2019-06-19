public class Main {

    public static void main(String[] args) {
/*
        Thread thread1 = new Thread(new MyRunnable("RUNNABLE"));
        thread1.start();

        Thread thread2 = new MyThread("THREAD");
        thread2.start();*/

      /*  DemoRunnable demoRunnable1 = new DemoRunnable("Thread1");
        DemoRunnable demoRunnable2 = new DemoRunnable("Thread2");

        demoRunnable1.start();
        demoRunnable2.start();*/

     /*   NumbersUtils numbersUtils = new NumbersUtils(0);
        Thread[] threads = new Thread[1000];
        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(new IncrementRunnable(numbersUtils));
            threads[i].start();
        }

        try {
            for (int i = 0; i < 1000; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Result: "+ numbersUtils.getNum());*/

      /* final DeadLockDemo deadLockDemo = new DeadLockDemo();
       Runnable run1 = new Runnable() {
           public void run() {
               deadLockDemo.method1();
           }
       };

       Runnable run2 = new Runnable() {
           public void run() {
               deadLockDemo.method2();
           }
       };

       Thread thread1 = new Thread(run1);
       Thread thread2 = new Thread(run2);

       thread1.start();
       thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/

      ThreadLifeCycle threadLifeCycle = new ThreadLifeCycle();
     // threadLifeCycle.stateNew();
      //threadLifeCycle.stateRunnable();
     // threadLifeCycle.stateTimeWaiting();
      //threadLifeCycle.stateTerminated();
      threadLifeCycle.stateBlocked();

    }
}

