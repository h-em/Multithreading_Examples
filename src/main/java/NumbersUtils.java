public class NumbersUtils {
    private int num;
    private Object monitor = new Object();

    public NumbersUtils(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }


    public void increment(){
        synchronized (monitor) {
            num++;
        }
    }
}
