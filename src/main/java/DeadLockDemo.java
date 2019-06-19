public class DeadLockDemo {
    private Object monitor1 = new Object();
    private Object monitor2= new Object();

    public void method1(){
        synchronized (monitor1){
            System.out.println("In method 1 -" + Thread.currentThread().getName());
            method2();
        }
    }
    public void method2(){
        synchronized (monitor2){
            System.out.println("In method 2 -"+ Thread.currentThread().getName());
            method3();
        }
    }
    public void method3(){
        synchronized (monitor1){
            System.out.println("In method 3 -" + Thread.currentThread().getName());
            method1();
        }
    }
}
