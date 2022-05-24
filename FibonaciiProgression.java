package Progression;

public class FibonaciiProgression extends Progression{

    private long adder = 0;

    public FibonaciiProgression() {

    }

    public FibonaciiProgression(long start) {
        super(start);
    }

    public void advance() {
        long currentNumber = current;
        current = currentNumber+adder;
        adder = currentNumber;
    }
}
