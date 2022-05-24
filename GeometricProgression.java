package Progression;

public class GeometricProgression extends Progression{
    private int factor;

    public GeometricProgression() {

    }

    public GeometricProgression(long start, int multiplier) {
        super(start);
        this.factor = multiplier;
    }

    public void advance() {
        current*=factor;
    }
}
