public class Main {
    public static void main(String[] args) {
        View view = new View();
        Accumulator myAccumulator = new Accumulator();
        new ViewController(view, myAccumulator);
    }
}