package Progression;

public class ArithmeticProgression extends Progression{
    private int factor;
    public ArithmeticProgression() {
    }

    public ArithmeticProgression(long start, int increment) {
        super(start);
        this.factor = increment;
    }

    public void advance(){
        current+=factor;
    }
    //no needed advance due to progression already does it
}
