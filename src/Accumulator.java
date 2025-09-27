public class Accumulator {
    private int currentValue = 0;
    private int maxValue = 10;

    public void setMaxValue(int max) {
        this.maxValue = max;
    }

    public int increment() {
        if (currentValue < maxValue) {
            currentValue++;
        }else{
            currentValue=0;
        }
        return currentValue;
    }
}