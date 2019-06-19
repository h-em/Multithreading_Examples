public class IncrementRunnable implements Runnable {

    private NumbersUtils numbersUtils;

    public IncrementRunnable(NumbersUtils numbersUtils) {
        this.numbersUtils = numbersUtils;
    }

    public void run() {
        for (int i = 0; i <1000 ; i++) {
            numbersUtils.increment();
        }
    }
}
